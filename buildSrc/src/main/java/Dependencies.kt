const val kotlinVersion = "1.3.72"
private const val coreVersion = "1.3.0"
private const val appCompatVersion = "1.1.0"
private const val constraintLayoutVersion = "2.0.0-beta4"
const val hiltAndroidVersion = "2.28-alpha"
private const val hiltVersion = "1.0.0-SNAPSHOT"
private const val lifecycleVersion = "2.2.0"
const val navigationVersion = "2.3.0-rc01"
const val gradleVersion = "4.0.0"
private const val epoxyVersion = "4.0.0-beta4"
private const val coilVersion = "0.11.0"
private const val jUnitExtVersion = "1.1.1"
private const val espressoVersion = "3.2.0"
private const val jUnitVersion = "4.13"

object Dependencies {

    object Kotlin {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
    }

    object AndroidX {
        const val core = "androidx.core:core-ktx:$coreVersion"
        const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
        const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
        const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
        const val lifecycleViewModelSavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycleVersion"
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:$navigationVersion"
        const val navigationUi = "androidx.navigation:navigation-ui-ktx:$navigationVersion"

        object Test {
            const val jUnit = "androidx.test.ext:junit:$jUnitExtVersion"
            const val espresso = "androidx.test.espresso:espresso-core:$espressoVersion"
        }
    }

    object Hilt {
        const val hiltCommon = "androidx.hilt:hilt-common:$hiltVersion"
        const val hiltLifecycleViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:$hiltVersion"
        const val hiltCompiler = "androidx.hilt:hilt-compiler:$hiltVersion"

        object Android {
            const val hiltAndroid = "com.google.dagger:hilt-android:$hiltAndroidVersion"
            const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:$hiltAndroidVersion"
        }
    }

    object Epoxy {
        const val epoxy = "com.airbnb.android:epoxy:$epoxyVersion"
        const val epoxyProcessor = "com.airbnb.android:epoxy-processor:$epoxyVersion"
        const val epoxyDataBinding = "com.airbnb.android:epoxy-databinding:$epoxyVersion"
    }

    object Coil {
        const val coil = "io.coil-kt:coil:$coilVersion"
    }

    object Test {
        const val jUnit = "junit:junit:$jUnitVersion"
    }
}
