//EXAMPLE 02-GRADLE-***
plugins {
    `java`
}

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
    constraints {
        implementation("org.apache.commons:commons-text:1.10.0")
    }

    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}
