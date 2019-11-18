import org.jetbrains.dokka.gradle.DokkaTask

plugins {
  id("com.android.library")
  kotlin("android")
  kotlin("kapt")
  kotlin("android.extensions")
  id("digital.wup.android-maven-publish") version Versions.digital_wup_android_maven_publish_gradle_plugin
  id("org.jetbrains.dokka")

}


android {
  compileSdkVersion(ProjectVersions.SDK_VERSION)

  defaultConfig {
    minSdkVersion(16)
    targetSdkVersion(ProjectVersions.SDK_VERSION)
    versionCode = ProjectVersions.BUILD_VERSION
    versionName = ProjectVersions.VERSION_NAME
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    consumerProguardFiles("consumer-rules.pro")
  }

  compileOptions {
    sourceCompatibility = ProjectVersions.JAVA_VERSION
    targetCompatibility = ProjectVersions.JAVA_VERSION
  }

  buildTypes {

    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
      )
    }

  }

  androidExtensions {
    isExperimental = true
  }

  testOptions {
    unitTests.setReturnDefaultValues(true)
  }

  val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(android.sourceSets.getByName("main").java.srcDirs)
  }

  publishing {
    publications {

      create<MavenPublication>("mavenAar") {
        groupId = ProjectVersions.GROUP_ID
        artifactId = "permissions"
        version = ProjectVersions.VERSION_NAME
        from(components["android"])
        artifact(sourcesJar.get())
      }
    }
  }

  kotlin {
    sourceSets {
      all {
        languageSettings.useExperimentalAnnotation("kotlinx.coroutines.ExperimentalCoroutinesApi")
        languageSettings.useExperimentalAnnotation("kotlinx.coroutines.FlowPreview")
      }
    }
  }





}




dependencies {


  implementation(Libs.slf4j_api)
  implementation(Libs.kotlin_stdlib_jdk8)

  api(Libs.kotlinx_coroutines_android)

  implementation(Libs.lifecycle_runtime_ktx)
//  implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.2.0-rc02")

  api(Libs.easypermissions)

/*  testImplementation(Libs.junit)
  testImplementation(Libs.androidx_test_core)
  testImplementation(Libs.logback_core)
  testImplementation(Libs.logback_classic)
  testImplementation(Libs.kxml2_min)
  testImplementation(Libs.robolectric)*/

}


