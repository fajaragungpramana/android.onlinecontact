plugins {
    id(Plugin.APPLICATION)
    id(Plugin.KOTLIN_ANDROID)
    id(Plugin.KOTLIN_KAPT)
}

android {
    compileSdk = Version.COMPILE_SDK

    defaultConfig {
        applicationId = "com.github.fajaragungpramana.onlinecontact"
        minSdk = Version.MIN_SDK
        targetSdk = Version.TARGET_SDK
        versionCode = Version.VERSION_CODE
        versionName = Version.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures.viewBinding = true
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(project(Module.COMMON))
    implementation(project(Module.REMOTE))
    implementation(project(Module.WIDGET))

}