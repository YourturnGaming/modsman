plugins {
    kotlin("jvm")
    application
}

dependencies {
    implementation(project(":modsman-core"))
    implementation(group = "com.beust", name = "jcommander", version = "1.72")
}

application {
    mainClass.set("modsman.cli.MainKt")
}
