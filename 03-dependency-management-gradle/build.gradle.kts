group = "tk.hildebrandt.gradle"
version = "1-SNAPSHOT"

subprojects {
    apply(plugin = "java")

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

}