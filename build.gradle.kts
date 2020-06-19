buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:$gradleVersion")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("com.google.dagger:hilt-android-gradle-plugin:$hiltAndroidVersion")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(url = uri("https://androidx.dev/snapshots/builds/6543454/artifacts/repository/"))
    }
}

task<Delete>("clean") {
    delete = setOf(rootProject.buildDir)
}
