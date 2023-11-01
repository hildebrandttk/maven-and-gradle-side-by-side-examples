plugins {
   id("init.gradle.java-application-conventions")
}

dependencies {
   implementation(project(":lib"))
   implementation("org.springframework.boot:spring-boot-starter-data-rest")
   implementation("org.springframework.boot:spring-boot-starter-data-jpa")
   testImplementation("org.springframework.boot:spring-boot-starter-test")
}
