//EXAMPLE 02-GRADLE-02
plugins {
   id("init.gradle.java-application-conventions")
}

dependencies {
   implementation(project(":lib"))
}
