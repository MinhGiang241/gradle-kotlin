plugins {
    id("java")
    id("checkstyle")
}

val myBuildGroup = "my project build"
tasks.named<TaskReportTask>("tasks") {
    displayGroup = myBuildGroup
}

tasks.build {
    group = myBuildGroup
}

tasks.check {
    group = myBuildGroup
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

tasks.test {
    useJUnitPlatform()
    testLogging.showStandardStreams = true
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
}
