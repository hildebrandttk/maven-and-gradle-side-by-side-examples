plugins {
   id("init.gradle.java-application-conventions")
}

dependencies {
   implementation(project(":lib"))
   implementation("org.springframework.boot:spring-boot-starter-data-rest")
   implementation("org.springframework.boot:spring-boot-starter-data-jpa")
   // EXAMPLE 04-GRADLE-02 include replacement
//   implementation("org.springframework.boot:spring-boot-starter-log4j2")
   implementation("com.h2database:h2:2.2.224")
   testImplementation("org.springframework.boot:spring-boot-starter-test")
   testImplementation("org.junit.jupiter:junit-jupiter")
}
