import org.gradle.api.JavaVersion

object ProjectVersions {
  const val SDK_VERSION = 29
  const val MIN_SDK_VERSION = 16
  const val VERSION_CODE = 16
  val JAVA_VERSION = JavaVersion.VERSION_1_8
  val VERSION_NAME = getVersionName()
  const val GROUP_ID = "com.github.danbrough.androidutils"

  fun getVersionName(code: Int = VERSION_CODE) = "1.0.${code-1}"
}
