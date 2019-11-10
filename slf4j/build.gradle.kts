plugins {
  id("com.android.library")

  id("digital.wup.android-maven-publish") version Versions.digital_wup_android_maven_publish_gradle_plugin

}



android {
  compileSdkVersion(ProjectVersions.SDK_VERSION)
  defaultConfig {
    minSdkVersion(ProjectVersions.MIN_SDK_VERSION)
    targetSdkVersion(ProjectVersions.SDK_VERSION)
    versionCode = ProjectVersions.VERSION_CODE
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

  val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(android.sourceSets.getByName("main").java.srcDirs)
  }


  publishing {
    publications {

      create<MavenPublication>("mavenAar") {
        groupId = "com.github.danbrough.util"
        artifactId = "slf4j"
        version = "1.0.0-test"
        from(components["android"])
        artifact(sourcesJar.get())

      }
    }
  }
}

dependencies {
  api(Libs.slf4j_api)
  //api(Libs.appcompat)

  androidTestImplementation(Libs.androidx_test_runner)
  androidTestImplementation(Libs.androidx_test_rules)
  androidTestImplementation(Libs.androidx_test_core)
}

/*
apply plugin: 'com.android.library'
apply plugin: 'com.github.dcendents.android-maven'


group=

android {
  compileSdkVersion SDK_COMPILE as int


  defaultConfig {
    minSdkVersion 1
    targetSdkVersion SDK_TARGET as int
    versionCode 1
    versionName "1.0.6"

    // testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"

  }

  buildTypes {
    release {
      minifyEnabled false
      proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
    }
  }

}

dependencies {

  implementation "org.slf4j:slf4j-api:${SLF4J}"

  testImplementation 'junit:junit:4.12'

  //androidTestImplementation 'com.android.support.test:runner:1.0.1'
  //androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.1'
}
*/
