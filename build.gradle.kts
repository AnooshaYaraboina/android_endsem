// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google() // Ensure this is included
        mavenCentral() // Ensure this is included
    }
    dependencies {
        classpath("com.google.gms:google-services:4.3.15")
    // Ensure you have the latest version
    }
}
