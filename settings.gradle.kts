pluginManagement {
    repositories {
        mavenLocal()
        maven {
            name = "entixReposilite"
            url = uri("https://repo.enitx.eu/releases")
        }
        gradlePluginPortal()
    }
}
rootProject.name = "hytale-plugin-template"