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
    // EXAMPLE 03-GRADLE-01 BOM-Import
//       implementation(platform("org.springframework.boot:spring-boot-dependencies:${springVersion}"))
    implementation(enforcedPlatform("org.springframework.boot:spring-boot-dependencies:${springVersion}"))

    // EXAMPLE 03-GRADLE-02 constraints
    constraints {
        implementation("org.apache.commons:commons-text:1.10.0")
//         implementation("org.springframework.boot:spring-boot-starter-data-rest:${springVersion}")
//         implementation("org.springframework.boot:spring-boot-starter-data-jpa:${springVersion}")
//         testImplementation("org.springframework.boot:spring-boot-starter-test:${springVersion}")
//         implementation("org.junit.jupiter:junit-jupiter:5.10.0")
    }

    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}