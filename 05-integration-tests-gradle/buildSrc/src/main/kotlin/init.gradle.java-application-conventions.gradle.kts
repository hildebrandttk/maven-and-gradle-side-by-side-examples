plugins {
    id("init.gradle.java-common-conventions")
    `application`
}

// EXAMPLE 05-GRADLE-01
val integrationTestTask = tasks.register<Test>("integrationTest") {
    description = "Runs integration tests."
    group = "verification"
    shouldRunAfter(tasks.named("test"))

    filter {
        includeTestsMatching("*IT.*")
    }
    useJUnitPlatform {
        // EXAMPLE 05-GRADLE-02
        excludeTags("slowtest")
    }
}

// EXAMPLE 05-GRADLE-03
tasks.named("check") {
    dependsOn(integrationTestTask)
}

// EXAMPLE 05-GRADLE-04
val slowIntegrationTestTask = tasks.register<Test>("slowIntegrationTest") {
    description = "Runs slow integration tests."
    group = "verification"
    shouldRunAfter(tasks.named("test"))

    useJUnitPlatform {
        // EXAMPLE 05-GRADLE-05
        includeTags("slowtest")
    }
}

// EXAMPLE 05-GRADLE-06
tasks.named("ci") {
    dependsOn(slowIntegrationTestTask, tasks.named("check"))
}
