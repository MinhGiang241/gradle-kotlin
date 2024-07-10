plugins {
    id("my-java-base")
    id("application")
}

val myBuildGroup = "mt project build"

tasks.named("run") {
    group = myBuildGroup
}
