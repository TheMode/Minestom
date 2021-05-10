import net.kyori.indra.IndraExtension

plugins {
    // indra
    val indraVersion = "2.0.2"
    id("net.kyori.indra") version indraVersion apply false
    id("net.kyori.indra.publishing") version indraVersion apply false

    // misc
    id("io.freefair.aggregate-javadoc-jar") version "5.3.3.3"
    id("com.github.ben-manes.versions") version "0.38.0"
}

group = "net.minestom"
version = "1.0.0-SNAPSHOT"
description = "Lightweight and multi-threaded Minecraft server implementation"

// aggregate javadoc
tasks.aggregateJavadoc.configure {
    title = "Minestom $version"

    // module exclusions
    val exclusions = listOf("minestom-demo").map {
        project(":$it").tasks.named("javadoc", Javadoc::class).get().classpath
    }
    exclude {
        exclusions.find { collection -> collection.contains(it.file) } != null
    }

    // javadoc options
    (options as? StandardJavadocDocletOptions)?.apply {
        options.encoding = "UTF-8"

        links("https://docs.oracle.com/en/java/javase/11/docs/api/")

        addBooleanOption("html5", true)
        addStringOption("-release", "11")
    }
}

// common settings for all projects
subprojects {
    apply(plugin = "net.kyori.indra")
    apply(plugin = "net.kyori.indra.publishing")

    repositories {
        mavenCentral()
        maven {
            name = "jitpack"
            url = uri("https://jitpack.io")
        }
        maven {
            name = "minecraft"
            url = uri("https://libraries.minecraft.net")
        }
        maven {
            name = "sponge"
            url = uri("https://repo.spongepowered/org/maven")
        }
        maven {
            name = "velocity"
            url = uri("https://repo.velocitypowered.com/snapshots")
        }
    }

    extensions.configure(IndraExtension::class) {
        javaVersions {
            target(11)
            testWith(11, 16)
        }

        github("Minestom", "Minstom") {
            ci(true)
        }

        apache2License()

        configurePublications {
            pom {
                developers {
                    developer {
                        id.set("TheMode")
                    }
                }
            }
        }
    }

    configurations.all {
        // we only use jetbrains annotations
        exclude("org.checkerframework", "checker-qual")
    }
}