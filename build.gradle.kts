plugins {
    id(Plugin.APPLICATION) version(Version.GRADLE) apply(false)
    id(Plugin.LIBRARY) version(Version.GRADLE) apply(false)
    id(Plugin.KOTLIN_ANDROID) version(Version.KOTLIN) apply(false)
}

tasks {
    registering(Delete::class) {
        delete(buildDir)
    }
}