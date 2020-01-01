plugins {
    id("com.android.application")
    kotlin("android")
    id("de.mannodermaus.android-junit5")
}

android {
    compileSdkVersion(29)

    defaultConfig {
        applicationId = "by.ve.jacocodemo"
        minSdkVersion(18)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.61")

    testImplementation("io.mockk:mockk:1.9.3")
    testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.9")
    testImplementation("org.spekframework.spek2:spek-runner-junit5:2.0.9")
    testImplementation("com.willowtreeapps.assertk:assertk-jvm:0.20")
    testImplementation("org.opentest4j:opentest4j:1.2.0")
}
