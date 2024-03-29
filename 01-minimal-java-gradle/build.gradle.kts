//EXAMPLE 01-GRADLE-***
plugins {
   `java-library`
   `maven-publish`
}

//EXAMPLE 01-GRADLE-***
repositories {
   mavenLocal()
   mavenCentral()
}
//EXAMPLE 01-GRADLE-02
group = "tk.hildebrandt.gradle"
//EXAMPLE 01-GRADLE-04
version = "1-SNAPSHOT"

//EXAMPLE 01-GRADLE-***
publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            //EXAMPLE 01-GRADLE-03 (overwrites the value from settings.gradle.kts)
            artifactId = "01-minimal-java-maven"
        }
    }
}

java {
   //EXAMPLE 01-GRADLE-05
   toolchain {
      languageVersion.set(JavaLanguageVersion.of(17))
   }
}

//Alternativ
//compileJava.options.encoding = "UTF-8"
//compileTestJava.options.encoding = "UTF-8"
//EXAMPLE 01-GRADLE-06
tasks.withType<JavaCompile>().configureEach {
   options.encoding = "UTF-8"
}

//Alternativ
//javadoc.options.encoding = "UTF-8"
//EXAMPLE 01-GRADLE-06
tasks.withType<Javadoc>().configureEach {
   options.encoding = "UTF-8"
}

//EXAMPLE 01-GRADLE-07
dependencies {
   testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

tasks.withType<Test>().configureEach {
   //EXAMPLE 01-GRADLE-09
   systemProperty("file.encoding", "UTF-8")
   //EXAMPLE 01-GRADLE-***
   useJUnitPlatform()
}