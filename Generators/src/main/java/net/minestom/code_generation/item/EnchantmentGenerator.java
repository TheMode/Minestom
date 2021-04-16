package net.minestom.code_generation.item;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.squareup.javapoet.*;
import net.minestom.code_generation.MinestomCodeGenerator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class EnchantmentGenerator extends MinestomCodeGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(EnchantmentGenerator.class);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private static final File DEFAULT_INPUT_FILE = new File(DEFAULT_SOURCE_FOLDER_ROOT + "/json", "enchantments.json");
    private final File enchantmentsFile;
    private final File outputFolder;

    public EnchantmentGenerator() {
        this(null, null);
    }

    public EnchantmentGenerator(@Nullable File enchantmentsFile) {
        this(enchantmentsFile, null);
    }

    public EnchantmentGenerator(@Nullable File enchantmentsFile, @Nullable File outputFolder) {
        this.enchantmentsFile = Objects.requireNonNullElse(enchantmentsFile, DEFAULT_INPUT_FILE);
        this.outputFolder = Objects.requireNonNullElse(outputFolder, DEFAULT_OUTPUT_FOLDER);
    }

    @Override
    public void generate() {
        if (!enchantmentsFile.exists()) {
            LOGGER.error("Failed to find enchantments.json.");
            LOGGER.error("Stopped code generation for enchantments.");
            return;
        }
        if (!outputFolder.exists() && !outputFolder.mkdirs()) {
            LOGGER.error("Output folder for code generation does not exist and could not be created.");
            return;
        }
        // Important classes we use alot
        ClassName namespaceIDClassName = ClassName.get("net.minestom.server.utils", "NamespaceID");
        ClassName rawEnchantmentDataClassName = ClassName.get("net.minestom.server.raw_data", "RawEnchantmentData");

        JsonArray enchantments;
        try {
            enchantments = GSON.fromJson(new JsonReader(new FileReader(enchantmentsFile)), JsonArray.class);
        } catch (FileNotFoundException e) {
            LOGGER.error("Failed to find enchantments.json.");
            LOGGER.error("Stopped code generation for enchantments.");
            return;
        }
        ClassName enchantmentClassName = ClassName.get("net.minestom.server.item", "Enchantment");

        // Enchantment
        TypeSpec.Builder enchantmentClass = TypeSpec.classBuilder(enchantmentClassName)
                .addSuperinterface(ClassName.get("net.kyori.adventure.key", "Keyed"))
                .addModifiers(Modifier.PUBLIC).addJavadoc("AUTOGENERATED");
        enchantmentClass.addField(
                FieldSpec.builder(namespaceIDClassName, "id")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL).addAnnotation(NotNull.class).build()
        );
        enchantmentClass.addField(
                FieldSpec.builder(rawEnchantmentDataClassName, "enchantmentData")
                        .initializer("new $T()", rawEnchantmentDataClassName)
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                        .addAnnotation(NotNull.class)
                        .build()
        );
        enchantmentClass.addMethod(
                MethodSpec.constructorBuilder()
                        .addParameter(ParameterSpec.builder(namespaceIDClassName, "id").addAnnotation(NotNull.class).build())
                        .addStatement("this.id = id")
                        .addModifiers(Modifier.PROTECTED)
                        .build()
        );
        // Override key method (adventure)
        enchantmentClass.addMethod(
                MethodSpec.methodBuilder("key")
                        .returns(ClassName.get("net.kyori.adventure.key", "Key"))
                        .addAnnotation(Override.class)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.id")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // getId method
        enchantmentClass.addMethod(
                MethodSpec.methodBuilder("getId")
                        .returns(namespaceIDClassName)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.id")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // getNumericalId
        enchantmentClass.addMethod(
                MethodSpec.methodBuilder("getNumericalId")
                        .returns(TypeName.INT)
                        .addStatement(
                                "return $T.getEnchantmentId(this)",
                                ClassName.get("net.minestom.server.registry", "Registries")
                        )
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // fromId Method
        enchantmentClass.addMethod(
                MethodSpec.methodBuilder("fromId")
                        .returns(enchantmentClassName)
                        .addAnnotation(Nullable.class)
                        .addParameter(TypeName.INT, "id")
                        .addStatement(
                                "return $T.getEnchantment(id)",
                                ClassName.get("net.minestom.server.registry", "Registries")
                        )
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .build()
        );
        // getEnchantmentData method
        enchantmentClass.addMethod(
                MethodSpec.methodBuilder("getEnchantmentData")
                        .returns(rawEnchantmentDataClassName)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.enchantmentData")
                        .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                        .build()
        );
        // values method
        enchantmentClass.addMethod(
                MethodSpec.methodBuilder("values")
                        .addAnnotation(NotNull.class)
                        .returns(ParameterizedTypeName.get(ClassName.get(List.class), enchantmentClassName))
                        .addStatement("return $T.getEnchantments()", ClassName.get("net.minestom.server.registry", "Registries"))
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .build()
        );

        CodeBlock.Builder staticBlock = CodeBlock.builder();
        // Use data
        for (JsonElement e : enchantments) {
            JsonObject item = e.getAsJsonObject();

            String enchantmentName = item.get("name").getAsString();

            enchantmentClass.addField(
                    FieldSpec.builder(
                            enchantmentClassName,
                            enchantmentName
                    ).initializer(
                            "new $T($T.from($S))",
                            enchantmentClassName,
                            namespaceIDClassName,
                            item.get("id").getAsString()
                    ).addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).build()
            );
            // Add to static init.
            staticBlock.addStatement("$T.registerEnchantment($N)", ClassName.get("net.minestom.server.registry", "Registries"), enchantmentName);
        }

        enchantmentClass.addStaticBlock(staticBlock.build());

        // Write files to outputFolder
        writeFiles(
                Collections.singletonList(
                        JavaFile.builder("net.minestom.server.item", enchantmentClass.build()).build()
                ),
                outputFolder
        );
    }
}
