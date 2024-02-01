plugins {
    kotlin("jvm") version "1.9.21"
    kotlin("plugin.serialization") version "1.9.21"
    `maven-publish`
}

group = "br.studyleague"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.2")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "br.studyleague"
            artifactId = "studyleague-shared"
            version = "1.0"

            from(components["java"])
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}