object Dependencies {

    object AndroidTest {
        const val JUNIT = "androidx.test.ext:junit:1.1.3"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.4.0"
        const val ESPRESSO_CONTRIB = "androidx.test.espresso:espresso-contrib:3.3.0"
        const val RULES = "androidx.test:rules:1.2.0"
        const val ESPRESSO_IDLING_RESOURCE = "androidx.test.espresso.idling:idling-concurrent:3.4.0"
    }

    object AndroidX {
        const val CORE = "androidx.core:core-ktx:1.7.0"
        const val APP_COMPAT = "androidx.appcompat:appcompat:1.4.1"
    }

    object DI {
        const val HILT = "com.google.dagger:hilt-android:${Version.HILT}"
        const val HILT_COMPILER = "com.google.dagger:hilt-compiler:${Version.HILT}"
    }

    object Material {
        const val GOOGLE = "com.google.android.material:material:1.5.0"
    }

    object SquareUp {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:2.9.0"
        const val GSON = "com.squareup.retrofit2:converter-gson:2.9.0"
        const val LOGGING = "com.squareup.okhttp3:logging-interceptor:4.9.2"
    }

    object Test {
        const val JUNIT = "junit:junit:4.13.2"
        const val MOCKITO = "org.mockito:mockito-core:4.0.0"
        const val MOCKITO_INLINE = "org.mockito:mockito-inline:4.0.0"
        const val MOCKITO_KOTLIN = "org.mockito.kotlin:mockito-kotlin:4.0.0"
        const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.2"
        const val ARCH = "androidx.arch.core:core-testing:2.1.0"
    }

}