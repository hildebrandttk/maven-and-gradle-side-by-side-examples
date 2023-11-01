//EXAMPLE 02-GRADLE-***
plugins {
    `java`
}

val springVersion by extra { "3.1.5" }

repositories {
    mavenLocal()
    mavenCentral()
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>().configureEach {
    options.encoding = "UTF-8"
}

tasks.withType<Test>().configureEach {
    systemProperty("file.encoding", "UTF-8")
    useJUnitPlatform()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    implementation(enforcedPlatform("org.springframework.boot:spring-boot-dependencies:${springVersion}"))

    constraints {
        implementation("org.apache.commons:commons-text:1.10.0")
    }

    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

// EXAMPLE 04-GRADLE-01 Exclude global
configurations {
    all {
        exclude(group = "org.springframework.boot", module = "spring-boot-starter-logging")
    }
}
