//[slf4j](../../index.md)/[org.slf4j.impl](../index.md)/[AndroidLoggerAdapter](index.md)



# AndroidLoggerAdapter  
 [androidJvm] 



 A simple implementation that delegates all log requests to the Google Android logging facilities. Note that this logger does not support org.slf4j.Marker . Methods taking marker data as parameter simply invoke the eponymous method without the Marker argument, discarding any marker data in the process. 



 The logging levels specified for SLF4J can be almost directly mapped to the levels that exist in the Google Android platform. The following table shows the mapping implemented by this logger. 



 Use loggers as usual: 

<ul><li>Declare a loggerprivate static final Logger logger = LoggerFactory.getLogger(MyClass.class);</li><li>Invoke logging methods, e.g.,logger.debug("Some log message. Details: { } ", someObject);logger.debug("Some log message with varargs. Details: { } , { } , { } ", someObject1, someObject2, someObject3);</li></ul>

 Logger instances created using the LoggerFactory are named either according to the name or the fully qualified class name of the class given as a parameter. Each logger name will be used as the log message tag on the Android platform. However, tag names cannot be longer than 23 characters so if logger name exceeds this limit then it will be truncated by the LoggerFactory. The following examples illustrate this. 





#### Author  


Andrey Korzhevskiy 

open class [AndroidLoggerAdapter](index.md) : MarkerIgnoringBase   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [AndroidLoggerAdapter](-android-logger-adapter.md)|  [androidJvm] <br><br>Package access allows only [AndroidLoggerFactory](../-android-logger-factory/index.md) to instantiate SimpleLogger instances.<br><br>open fun [AndroidLoggerAdapter](-android-logger-adapter.md)(logInfo: [AndroidLoggerFactory.LogInfo](../-android-logger-factory/-log-info/index.md))   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [debug](debug.md)| [androidJvm]  <br>Brief description  <br><br><br>Log a message object at level DEBUG.<br><br>  <br>Content  <br>open fun [debug](debug.md)(msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))  <br><br><br>[androidJvm]  <br>Content  <br>open fun [debug](index.md#org.slf4j.helpers/MarkerIgnoringBase/debug/#org.slf4j.Marker#java.lang.String/PointingToDeclaration/)(marker: Marker, msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br><br><br>Log a message at level DEBUG according to the specified format and arguments. <br><br><br><br> This form avoids superfluous object creation when the logger is disabled for the DEBUG level. <br><br><br><br>  <br>Content  <br>open fun [debug](debug.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), argArray: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>)  <br>open fun [debug](debug.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), arg1: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), arg2: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br><br><br>Log a message at level DEBUG according to the specified format and argument. <br><br><br><br> This form avoids superfluous object creation when the logger is disabled for level DEBUG. <br><br><br><br>  <br>Content  <br>open fun [debug](debug.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), arg: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br>Log an exception (throwable) at level DEBUG with an accompanying message.<br><br>  <br>Content  <br>open fun [debug](debug.md)(msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), t: [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html))  <br><br><br>
| [error](error.md)| [androidJvm]  <br>Brief description  <br><br><br>Log a message object at the ERROR level.<br><br>  <br>Content  <br>open fun [error](error.md)(msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))  <br><br><br>[androidJvm]  <br>Content  <br>open fun [error](index.md#org.slf4j.helpers/MarkerIgnoringBase/error/#org.slf4j.Marker#java.lang.String/PointingToDeclaration/)(marker: Marker, msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br><br><br>Log a message at level ERROR according to the specified format and arguments. <br><br><br><br> This form avoids superfluous object creation when the logger is disabled for the ERROR level. <br><br><br><br>  <br>Content  <br>open fun [error](error.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), argArray: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>)  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br><br><br>Log a message at the ERROR level according to the specified format and argument. <br><br><br><br> This form avoids superfluous object creation when the logger is disabled for the ERROR level. <br><br><br><br>  <br>Content  <br>open fun [error](error.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), arg: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br>Log an exception (throwable) at the ERROR level with an accompanying message.<br><br>  <br>Content  <br>open fun [error](error.md)(msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), t: [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html))  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br><br><br>Log a message at the ERROR level according to the specified format and arguments. <br><br><br><br> This form avoids superfluous object creation when the logger is disabled for the ERROR level. <br><br><br><br>  <br>Content  <br>open fun [error](error.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), arg1: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), arg2: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  <br><br><br>
| [getName](index.md#org.slf4j.helpers/NamedLoggerBase/getName/#/PointingToDeclaration/)| [androidJvm]  <br>Content  <br>open fun [getName](index.md#org.slf4j.helpers/NamedLoggerBase/getName/#/PointingToDeclaration/)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)  <br><br><br>
| [info](info.md)| [androidJvm]  <br>Brief description  <br><br><br>Log a message object at the INFO level.<br><br>  <br>Content  <br>open fun [info](info.md)(msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))  <br><br><br>[androidJvm]  <br>Content  <br>open fun [info](index.md#org.slf4j.helpers/MarkerIgnoringBase/info/#org.slf4j.Marker#java.lang.String/PointingToDeclaration/)(marker: Marker, msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br><br><br>Log a message at level INFO according to the specified format and arguments. <br><br><br><br> This form avoids superfluous object creation when the logger is disabled for the INFO level. <br><br><br><br>  <br>Content  <br>open fun [info](info.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), argArray: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>)  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br><br><br>Log a message at level INFO according to the specified format and argument. <br><br><br><br> This form avoids superfluous object creation when the logger is disabled for the INFO level. <br><br><br><br>  <br>Content  <br>open fun [info](info.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), arg: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br>Log an exception (throwable) at the INFO level with an accompanying message.<br><br>  <br>Content  <br>open fun [info](info.md)(msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), t: [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html))  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br><br><br>Log a message at the INFO level according to the specified format and arguments. <br><br><br><br> This form avoids superfluous object creation when the logger is disabled for the INFO level. <br><br><br><br>  <br>Content  <br>open fun [info](info.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), arg1: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), arg2: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  <br><br><br>
| [isDebugEnabled](is-debug-enabled.md)| [androidJvm]  <br>Brief description  <br><br><br>Is this logger instance enabled for the DEBUG level?<br><br>  <br>Content  <br>open fun [isDebugEnabled](is-debug-enabled.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>[androidJvm]  <br>Content  <br>open fun [isDebugEnabled](index.md#org.slf4j.helpers/MarkerIgnoringBase/isDebugEnabled/#org.slf4j.Marker/PointingToDeclaration/)(marker: Marker): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [isErrorEnabled](is-error-enabled.md)| [androidJvm]  <br>Brief description  <br><br><br>Is this logger instance enabled for level ERROR?<br><br>  <br>Content  <br>open fun [isErrorEnabled](is-error-enabled.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>[androidJvm]  <br>Content  <br>open fun [isErrorEnabled](index.md#org.slf4j.helpers/MarkerIgnoringBase/isErrorEnabled/#org.slf4j.Marker/PointingToDeclaration/)(marker: Marker): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [isInfoEnabled](is-info-enabled.md)| [androidJvm]  <br>Brief description  <br><br><br>Is this logger instance enabled for the INFO level?<br><br>  <br>Content  <br>open fun [isInfoEnabled](is-info-enabled.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>[androidJvm]  <br>Content  <br>open fun [isInfoEnabled](index.md#org.slf4j.helpers/MarkerIgnoringBase/isInfoEnabled/#org.slf4j.Marker/PointingToDeclaration/)(marker: Marker): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [isTraceEnabled](is-trace-enabled.md)| [androidJvm]  <br>Brief description  <br><br><br>Is this logger instance enabled for the VERBOSE level?<br><br>  <br>Content  <br>open fun [isTraceEnabled](is-trace-enabled.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>[androidJvm]  <br>Content  <br>open fun [isTraceEnabled](index.md#org.slf4j.helpers/MarkerIgnoringBase/isTraceEnabled/#org.slf4j.Marker/PointingToDeclaration/)(marker: Marker): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [isWarnEnabled](is-warn-enabled.md)| [androidJvm]  <br>Brief description  <br><br><br>Is this logger instance enabled for the WARN level?<br><br>  <br>Content  <br>open fun [isWarnEnabled](is-warn-enabled.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>[androidJvm]  <br>Content  <br>open fun [isWarnEnabled](index.md#org.slf4j.helpers/MarkerIgnoringBase/isWarnEnabled/#org.slf4j.Marker/PointingToDeclaration/)(marker: Marker): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [readResolve](index.md#org.slf4j.helpers/NamedLoggerBase/readResolve/#/PointingToDeclaration/)| [androidJvm]  <br>Content  <br>open fun [readResolve](index.md#org.slf4j.helpers/NamedLoggerBase/readResolve/#/PointingToDeclaration/)(): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)  <br><br><br>
| [toString](index.md#org.slf4j.helpers/MarkerIgnoringBase/toString/#/PointingToDeclaration/)| [androidJvm]  <br>Content  <br>open fun [toString](index.md#org.slf4j.helpers/MarkerIgnoringBase/toString/#/PointingToDeclaration/)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)  <br><br><br>
| [trace](trace.md)| [androidJvm]  <br>Brief description  <br><br><br>Log a message object at level VERBOSE.<br><br>  <br>Content  <br>open fun [trace](trace.md)(msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))  <br><br><br>[androidJvm]  <br>Content  <br>open fun [trace](index.md#org.slf4j.helpers/MarkerIgnoringBase/trace/#org.slf4j.Marker#java.lang.String/PointingToDeclaration/)(marker: Marker, msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br><br><br>Log a message at level VERBOSE according to the specified format and arguments. <br><br><br><br> This form avoids superfluous object creation when the logger is disabled for the VERBOSE level. <br><br><br><br>  <br>Content  <br>open fun [trace](trace.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), argArray: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>)  <br>open fun [trace](trace.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), arg1: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), arg2: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br><br><br>Log a message at level VERBOSE according to the specified format and argument. <br><br><br><br> This form avoids superfluous object creation when the logger is disabled for level VERBOSE. <br><br><br><br>  <br>Content  <br>open fun [trace](trace.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), arg: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br>Log an exception (throwable) at level VERBOSE with an accompanying message.<br><br>  <br>Content  <br>open fun [trace](trace.md)(msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), t: [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html))  <br><br><br>
| [warn](warn.md)| [androidJvm]  <br>Brief description  <br><br><br>Log a message object at the WARN level.<br><br>  <br>Content  <br>open fun [warn](warn.md)(msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))  <br><br><br>[androidJvm]  <br>Content  <br>open fun [warn](index.md#org.slf4j.helpers/MarkerIgnoringBase/warn/#org.slf4j.Marker#java.lang.String/PointingToDeclaration/)(marker: Marker, msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br><br><br>Log a message at level WARN according to the specified format and arguments. <br><br><br><br> This form avoids superfluous object creation when the logger is disabled for the WARN level. <br><br><br><br>  <br>Content  <br>open fun [warn](warn.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), argArray: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>)  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br><br><br>Log a message at the WARN level according to the specified format and argument. <br><br><br><br> This form avoids superfluous object creation when the logger is disabled for the WARN level. <br><br><br><br>  <br>Content  <br>open fun [warn](warn.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), arg: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br>Log an exception (throwable) at the WARN level with an accompanying message.<br><br>  <br>Content  <br>open fun [warn](warn.md)(msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), t: [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html))  <br><br><br>[androidJvm]  <br>Brief description  <br><br><br><br><br>Log a message at the WARN level according to the specified format and arguments. <br><br><br><br> This form avoids superfluous object creation when the logger is disabled for the WARN level. <br><br><br><br>  <br>Content  <br>open fun [warn](warn.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), arg1: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), arg2: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  <br><br><br>
