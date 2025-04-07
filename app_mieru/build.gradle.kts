plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

setupAll()

android {
    defaultConfig {
        applicationId = "moe.matsuri.exe.mieru"
        versionCode = 1
        versionName = "3.35.0"
        splits.abi {
            reset()
            include("arm64-v8a")
        }
    }
}
