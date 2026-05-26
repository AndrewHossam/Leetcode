plugins {
    kotlin("jvm") version "2.3.21"
}

group = "me.andrewhossan"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("junit:junit:4.13.2")
}
tasks.test {
    useJUnit()
}

kotlin {
    jvmToolchain(21)
}
