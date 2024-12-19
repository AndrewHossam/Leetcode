import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.0.21"
}

group = "me.andrew"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(kotlin("test"))
    testImplementation("junit:junit:4.13.1")
}
tasks.test {
    useJUnit()
}

kotlin {
    jvmToolchain(17)
}
