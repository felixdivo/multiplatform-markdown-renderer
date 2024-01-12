object Versions {
    const val androidMinSdk = 21
    const val androidCompileSdk = 34
    const val androidTargetSdk = androidCompileSdk

    const val kotlin = "1.9.21"

    const val markdown = "0.6.1"

    const val coil = "2.5.0"
    const val compose = "1.5.4"
    const val composeCompiler = "1.5.5"

    const val material = "1.11.0"
    const val activityCompose = "1.8.2"
}

object Deps {
    object Android {
        const val material = "com.google.android.material:material:${Versions.material}"
    }

    object AndroidX {
        const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
    }

    object Markdown {
        const val core = "org.jetbrains:markdown:${Versions.markdown}"
    }

    object Compose {
        const val ui = "androidx.compose.ui:ui:${Versions.compose}"
        const val uiGraphics = "androidx.compose.ui:ui-graphics:${Versions.compose}"
        const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
        const val foundationLayout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
        const val material = "androidx.compose.material:material:${Versions.compose}"

        const val coilCompose = "io.coil-kt:coil-compose:${Versions.coil}"
    }
}
