package net.minestom.codegen.statistics;

import com.google.gson.JsonObject;
import com.squareup.javapoet.*;
import net.minestom.codegen.MinestomCodeGenerator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;

public final class StatisticGenerator extends MinestomCodeGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(StatisticGenerator.class);
    private final InputStream statisticsFile;
    private final File outputFolder;

    public StatisticGenerator(@Nullable InputStream statisticsFile, @NotNull File outputFolder) {
        this.statisticsFile = statisticsFile;
        this.outputFolder = outputFolder;
    }

    @Override
    public void generate() {
        if (statisticsFile == null) {
            LOGGER.error("Failed to find statistics.json.");
            LOGGER.error("Stopped code generation for statistics.");
            return;
        }
        if (!outputFolder.exists() && !outputFolder.mkdirs()) {
            LOGGER.error("Output folder for code generation does not exist and could not be created.");
            return;
        }
        // Important classes we use alot
        ClassName namespaceIDClassName = ClassName.get("net.minestom.server.utils", "NamespaceID");
        ClassName registriesClassName = ClassName.get("net.minestom.server.registry", "Registries");

        JsonObject statistics = GSON.fromJson(new InputStreamReader(statisticsFile), JsonObject.class);
        ClassName statisticClassName = ClassName.get("net.minestom.server.statistic", "StatisticType");

        // Particle
        TypeSpec.Builder statisticClass = TypeSpec.enumBuilder(statisticClassName)
                .addSuperinterface(ClassName.get("net.kyori.adventure.key", "Keyed"))
                .addModifiers(Modifier.PUBLIC).addJavadoc("AUTOGENERATED by " + getClass().getSimpleName());

        statisticClass.addField(
                FieldSpec.builder(namespaceIDClassName, "id")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL).addAnnotation(NotNull.class).build()
        );
        // static field
        statisticClass.addField(
                FieldSpec.builder(ArrayTypeName.of(statisticClassName), "VALUES")
                        .addModifiers(Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL)
                        .initializer("values()")
                        .build()
        );

        statisticClass.addMethod(
                MethodSpec.constructorBuilder()
                        .addParameter(ParameterSpec.builder(namespaceIDClassName, "id").addAnnotation(NotNull.class).build())
                        .addStatement("this.id = id")
                        .addStatement("$T.statisticTypes.put(id, this)", registriesClassName)
                        .build()
        );
        // Override key method (adventure)
        statisticClass.addMethod(
                MethodSpec.methodBuilder("key")
                        .returns(ClassName.get("net.kyori.adventure.key", "Key"))
                        .addAnnotation(Override.class)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.id")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // getId method
        statisticClass.addMethod(
                MethodSpec.methodBuilder("getId")
                        .returns(TypeName.SHORT)
                        .addStatement("return (short) ordinal()")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // getNamespaceID method
        statisticClass.addMethod(
                MethodSpec.methodBuilder("getNamespaceID")
                        .returns(namespaceIDClassName)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.id")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // fromId Method
        statisticClass.addMethod(
                MethodSpec.methodBuilder("fromId")
                        .returns(statisticClassName)
                        .addAnnotation(Nullable.class)
                        .addParameter(TypeName.SHORT, "id")
                        .beginControlFlow("if(id >= 0 && id < VALUES.length)")
                        .addStatement("return VALUES[id]")
                        .endControlFlow()
                        .addStatement("return null")
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .build()
        );
        // toString method
        statisticClass.addMethod(
                MethodSpec.methodBuilder("toString")
                        .addAnnotation(NotNull.class)
                        .addAnnotation(Override.class)
                        .returns(String.class)
                        // this resolves to [Namespace]
                        .addStatement("return \"[\" + this.id + \"]\"")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );

        // Use data
        statistics.entrySet().forEach(entry -> {
            final String statisticNamespace = entry.getKey();
            final String statisticConstant = toConstant(statisticNamespace);
            statisticClass.addEnumConstant(statisticConstant, TypeSpec.anonymousClassBuilder(
                            "$T.from($S)",
                            namespaceIDClassName,
                            statisticNamespace
                    ).build()
            );
        });

        // Write files to outputFolder
        writeFiles(
                Collections.singletonList(
                        JavaFile.builder("net.minestom.server.statistic", statisticClass.build())
                                .indent("    ")
                                .skipJavaLangImports(true)
                                .build()
                ),
                outputFolder
        );
    }
}
