rootProject.name = "my-project"

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
    includeBuild("../my-build-logic")
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    includeBuild("../my-other-project")
}

include("app")
include("bussiness-logic")
include("data-model")

/*
rootDir.listFiles().filter { it.isDirectory && !it.isHidden }.forEach {
    include(it.name)
}
*/
