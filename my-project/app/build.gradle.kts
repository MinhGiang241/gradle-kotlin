plugins {
    id("application")
}

application {
    mainClass.set("MyApplication")
}

dependencies {
    implementation(project(":bussiness-logic"))
}
