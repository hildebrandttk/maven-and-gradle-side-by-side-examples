plugins {
   id("init.gradle.java-application-conventions")
}

dependencies {
   implementation(project(":lib"))
   implementation("org.springframework.boot:spring-boot-starter-data-rest")
   implementation("org.springframework.boot:spring-boot-starter-data-jpa")
   implementation("com.h2database:h2:2.2.224")
   testImplementation("org.springframework.boot:spring-boot-starter-test")
   testImplementation("org.junit.jupiter:junit-jupiter")
}

// EXAMPLE 04-GRADLE-01 Option with extra source tree
val seperatedIntegrationTest = sourceSets.create("seperatedIntegrationTest")

//val seperatedIntegrationTestImplementation by configurations.getting {
//    extendsFrom(configurations.implementation.get())
//}

//val seperatedIntegrationTestRuntimeOnly by configurations.getting

configurations["seperatedIntegrationTestImplementation"].extendsFrom(configurations.implementation.get())
configurations["seperatedIntegrationTestRuntimeOnly"].extendsFrom(configurations.runtimeOnly.get())

val seperatedIntegrationTestImplementation = configurations.getByName("seperatedIntegrationTestImplementation")

dependencies {
    seperatedIntegrationTestImplementation("org.springframework.boot:spring-boot-starter-test")
    seperatedIntegrationTestImplementation("org.junit.jupiter:junit-jupiter")
}

val seperatedIntegrationTestTask = tasks.register<Test>("seperatedIntegrationTest") {
   description = "Runs integration tests from special directory."
   group = "verification"

   testClassesDirs = seperatedIntegrationTest.output.classesDirs
   classpath = configurations[seperatedIntegrationTest.runtimeClasspathConfigurationName] + seperatedIntegrationTest.output

   shouldRunAfter(tasks.named("integrationTest"))
}

tasks.named("check") {
   dependsOn(seperatedIntegrationTestTask)
}
