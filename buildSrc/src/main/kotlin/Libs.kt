import kotlin.String

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Update this file with
 *   `$ ./gradlew buildSrcVersions`
 */
object Libs {
    /**
     * https://github.com/Kotlin/kotlinx.coroutines
     */
    const val kotlinx_coroutines_android: String =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:" +
            Versions.org_jetbrains_kotlinx_kotlinx_coroutines

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_android_extensions: String =
            "org.jetbrains.kotlin:kotlin-android-extensions:" + Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_android_extensions_runtime: String =
            "org.jetbrains.kotlin:kotlin-android-extensions-runtime:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_annotation_processing_gradle: String =
            "org.jetbrains.kotlin:kotlin-annotation-processing-gradle:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_gradle_plugin: String = "org.jetbrains.kotlin:kotlin-gradle-plugin:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_reflect: String = "org.jetbrains.kotlin:kotlin-reflect:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_stdlib_jdk8: String = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html
     */
    const val lifecycle_extensions: String = "androidx.lifecycle:lifecycle-extensions:" +
            Versions.androidx_lifecycle

    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val lifecycle_livedata_ktx: String = "androidx.lifecycle:lifecycle-livedata-ktx:" +
            Versions.androidx_lifecycle

    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val lifecycle_runtime_ktx: String = "androidx.lifecycle:lifecycle-runtime-ktx:" +
            Versions.androidx_lifecycle

    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val lifecycle_viewmodel_ktx: String = "androidx.lifecycle:lifecycle-viewmodel-ktx:" +
            Versions.androidx_lifecycle

    const val multidex_instrumentation: String = "androidx.multidex:multidex-instrumentation:" +
            Versions.androidx_multidex

    const val multidex: String = "androidx.multidex:multidex:" + Versions.androidx_multidex

    /**
     * https://developer.android.com/testing
     */
    const val androidx_test_core: String = "androidx.test:core:" + Versions.androidx_test

    /**
     * https://developer.android.com/testing
     */
    const val androidx_test_rules: String = "androidx.test:rules:" + Versions.androidx_test

    /**
     * https://developer.android.com/testing
     */
    const val androidx_test_runner: String = "androidx.test:runner:" + Versions.androidx_test

    /**
     * https://developer.android.com/studio
     */
    const val com_android_tools_build_gradle: String = "com.android.tools.build:gradle:" +
            Versions.com_android_tools_build_gradle

    const val digital_wup_android_maven_publish_gradle_plugin: String =
            "digital.wup.android-maven-publish:digital.wup.android-maven-publish.gradle.plugin:" +
            Versions.digital_wup_android_maven_publish_gradle_plugin

    const val de_fayard_buildsrcversions_gradle_plugin: String =
            "de.fayard.buildSrcVersions:de.fayard.buildSrcVersions.gradle.plugin:" +
            Versions.de_fayard_buildsrcversions_gradle_plugin

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html
     */
    const val navigation_safe_args_gradle_plugin: String =
            "androidx.navigation:navigation-safe-args-gradle-plugin:" +
            Versions.navigation_safe_args_gradle_plugin

    const val org_jetbrains_dokka_gradle_plugin: String =
            "org.jetbrains.dokka:org.jetbrains.dokka.gradle.plugin:" +
            Versions.org_jetbrains_dokka_gradle_plugin

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html
     */
    const val navigation_fragment_ktx: String = "androidx.navigation:navigation-fragment-ktx:" +
            Versions.navigation_fragment_ktx

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html
     */
    const val navigation_ui_ktx: String = "androidx.navigation:navigation-ui-ktx:" +
            Versions.navigation_ui_ktx

    /**
     * http://tools.android.com
     */
    const val constraintlayout: String = "androidx.constraintlayout:constraintlayout:" +
            Versions.constraintlayout

    /**
     * https://github.com/googlesamples/easypermissions
     */
    const val easypermissions: String = "pub.devrel:easypermissions:" + Versions.easypermissions

    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val fragment_ktx: String = "androidx.fragment:fragment-ktx:" + Versions.fragment_ktx

    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val recyclerview: String = "androidx.recyclerview:recyclerview:" + Versions.recyclerview

    /**
     * https://developer.android.com/studio
     */
    const val lint_gradle: String = "com.android.tools.lint:lint-gradle:" + Versions.lint_gradle

    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val appcompat: String = "androidx.appcompat:appcompat:" + Versions.appcompat

    /**
     * http://www.slf4j.org
     */
    const val slf4j_api: String = "org.slf4j:slf4j-api:" + Versions.slf4j_api

    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val core_ktx: String = "androidx.core:core-ktx:" + Versions.core_ktx

    /**
     * http://developer.android.com/tools/extras/support-library.html
     */
    const val material: String = "com.google.android.material:material:" + Versions.material

    /**
     * https://developer.android.com/studio
     */
    const val aapt2: String = "com.android.tools.build:aapt2:" + Versions.aapt2
}
