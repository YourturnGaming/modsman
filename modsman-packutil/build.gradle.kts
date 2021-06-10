plugins {
    kotlin("jvm")
    application
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

dependencies {
    implementation(project(":modsman-core"))
    implementation(group = "com.beust", name = "jcommander", version = "1.72")
}

application {
    mainClass.set("modsman.packutil.MainKt")
}

tasks {
    shadowJar {
        archiveClassifier.set("")
    }
}
