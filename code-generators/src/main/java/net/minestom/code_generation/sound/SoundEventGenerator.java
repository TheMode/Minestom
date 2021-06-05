package net.minestom.code_generation.sound;

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

public final class SoundEventGenerator extends MinestomCodeGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(SoundEventGenerator.class);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private final File soundsFile;
    private final File outputFolder;

    public SoundEventGenerator(@NotNull File itemsFile, @NotNull File outputFolder) {
        this.soundsFile = itemsFile;
        this.outputFolder = outputFolder;
    }

    @Override
    public void generate() {
        if (!soundsFile.exists()) {
            LOGGER.error("Failed to find sounds.json.");
            LOGGER.error("Stopped code generation for sounds.");
            return;
        }
        if (!outputFolder.exists() && !outputFolder.mkdirs()) {
            LOGGER.error("Output folder for code generation does not exist and could not be created.");
            return;
        }
        // Important classes we use alot
        ClassName namespaceIDClassName = ClassName.get("net.minestom.server.utils", "NamespaceID");
        ClassName registryClassName = ClassName.get("net.minestom.server.registry", "Registry");

        JsonArray sounds;
        try {
            sounds = GSON.fromJson(new JsonReader(new FileReader(soundsFile)), JsonArray.class);
        } catch (FileNotFoundException e) {
            LOGGER.error("Failed to find sounds.json.");
            LOGGER.error("Stopped code generation for sounds.");
            return;
        }
        ClassName soundClassName = ClassName.get("net.minestom.server.sound", "SoundEvent");
        // Sound
        TypeSpec.Builder soundClass = TypeSpec.classBuilder(soundClassName)
                .addSuperinterface(ClassName.get("net.kyori.adventure.key", "Keyed"))
                .addSuperinterface(ClassName.get("net.kyori.adventure.sound", "Sound", "Type"))
                .addModifiers(Modifier.PUBLIC).addJavadoc("AUTOGENERATED by " + getClass().getSimpleName());
        soundClass.addField(
                FieldSpec.builder(namespaceIDClassName, "id")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL).addAnnotation(NotNull.class).build()
        );
        soundClass.addMethod(
                MethodSpec.constructorBuilder()
                        .addParameter(ParameterSpec.builder(namespaceIDClassName, "id").addAnnotation(NotNull.class).build())
                        .addStatement("this.id = id")
                        .addModifiers(Modifier.PROTECTED)
                        .build()
        );
        // Override key method (adventure)
        soundClass.addMethod(
                MethodSpec.methodBuilder("key")
                        .returns(ClassName.get("net.kyori.adventure.key", "Key"))
                        .addAnnotation(Override.class)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.id")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // getId method
        soundClass.addMethod(
                MethodSpec.methodBuilder("getId")
                        .returns(namespaceIDClassName)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.id")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // getNumericalId
        soundClass.addMethod(
                MethodSpec.methodBuilder("getNumericalId")
                        .returns(TypeName.INT)
                        .addStatement("return $T.SOUND_EVENT_REGISTRY.getId(this)", registryClassName)
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // fromId Method
        soundClass.addMethod(
                MethodSpec.methodBuilder("fromId")
                        .returns(soundClassName)
                        .addAnnotation(Nullable.class)
                        .addParameter(TypeName.INT, "id")
                        .addStatement("return $T.SOUND_EVENT_REGISTRY.get((short) id)", registryClassName)
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .build()
        );
        // fromId Method
        soundClass.addMethod(
                MethodSpec.methodBuilder("fromId")
                        .returns(soundClassName)
                        .addAnnotation(NotNull.class)
                        .addParameter(ClassName.get("net.kyori.adventure.key", "Key"), "id")
                        .addStatement("return $T.SOUND_EVENT_REGISTRY.get(id)", registryClassName)
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .build()
        );
        // toString method
        soundClass.addMethod(
                MethodSpec.methodBuilder("toString")
                        .addAnnotation(NotNull.class)
                        .addAnnotation(Override.class)
                        .returns(String.class)
                        // this resolves to [Namespace]
                        .addStatement("return \"[\" + this.id + \"]\"")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // values method
        soundClass.addMethod(
                MethodSpec.methodBuilder("values")
                        .addAnnotation(NotNull.class)
                        .returns(ParameterizedTypeName.get(ClassName.get(List.class), soundClassName))
                        .addStatement("return $T.SOUND_EVENT_REGISTRY.values()", registryClassName)
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .build()
        );

        CodeBlock.Builder staticBlock = CodeBlock.builder();
        // Use data
        for (JsonElement s : sounds) {
            JsonObject sound = s.getAsJsonObject();

            String soundName = sound.get("name").getAsString();

            soundClass.addField(
                    FieldSpec.builder(
                            soundClassName,
                            soundName
                    ).initializer(
                            "new $T($T.from($S))",
                            soundClassName,
                            namespaceIDClassName,
                            sound.get("id").getAsString()
                    ).addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).build()
            );
            // Add to static init.
            staticBlock.addStatement("$T.SOUND_EVENT_REGISTRY.register($N)", registryClassName, soundName);
        }

        // Write files to outputFolder
        writeFiles(
                Collections.singletonList(
                        JavaFile.builder("net.minestom.server.sound", soundClass.build())
                                .indent("    ")
                                .skipJavaLangImports(true)
                                .build()
                ),
                outputFolder
        );
    }
}
