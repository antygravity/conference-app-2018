import org.gradle.api.JavaVersion.VERSION_1_7
import org.gradle.api.JavaVersion.VERSION_1_8
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.repositories
import org.gradle.kotlin.dsl.version
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", Versions.kotlin))
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

plugins {
    id("java-library")
    kotlin("jvm") version Versions.kotlin
}
apply {
    plugin("kotlin")
}

dependencies {
    compile(kotlin("stdlib-jdk7", Versions.kotlin))
}

java {
    sourceCompatibility = VERSION_1_8
    targetCompatibility = VERSION_1_8
}
