plugins {
    kotlin("jvm") version "1.9.22"
}

group = "ru.Monastyrskiy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testImplementation("com.codeborne:selenide:7.0.4")
    testImplementation("io.rest-assured:rest-assured:5.4.0")
    testImplementation("io.qameta.allure:allure-junit5:2.25.0")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "failed", "skipped")
        showStandardStreams = true
    }
}