plugins {
    id(Plugin.LIBRARY)
    id(Plugin.KOTLIN_ANDROID)
    id(Plugin.KOTLIN_KAPT)
    id(Plugin.HILT)
}

android {
    compileSdk = Version.COMPILE_SDK

    defaultConfig {
        minSdk = Version.MIN_SDK
        targetSdk = Version.TARGET_SDK

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

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

    implementation(Dependencies.DI.HILT)
    kapt(Dependencies.DI.HILT_COMPILER)

    implementation(Dependencies.SquareUp.GSON)
    api(Dependencies.SquareUp.RETROFIT)
    implementation(Dependencies.SquareUp.LOGGING)

    androidTestImplementation(Dependencies.Test.JUNIT)
    androidTestImplementation(Dependencies.Test.MOCKITO)
    androidTestImplementation(Dependencies.Test.MOCKITO_INLINE)
    androidTestImplementation(Dependencies.Test.MOCKITO_KOTLIN)
    androidTestImplementation(Dependencies.Test.COROUTINES)
    androidTestImplementation(Dependencies.Test.ARCH)

}