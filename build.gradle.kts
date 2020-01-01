// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath("de.mannodermaus.gradle.plugins:android-junit5:1.5.2.0")
        classpath("com.android.tools.build:gradle:3.5.3")
    }
}

plugins {
    kotlin("jvm") version "1.3.61"
    id("testCoverage") apply false
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(url = "https://kotlin.bintray.com/kotlinx/")
    }
}

subprojects {
    afterEvaluate {
        apply(plugin = "testCoverage")
    }
}