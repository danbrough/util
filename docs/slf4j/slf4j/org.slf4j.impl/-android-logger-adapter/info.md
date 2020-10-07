//[slf4j](../../index.md)/[org.slf4j.impl](../index.md)/[AndroidLoggerAdapter](index.md)/[info](info.md)



# info  
[androidJvm]  
Brief description  


Log a message object at the INFO level.



## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| msg| <br><br>- the message object to be logged<br><br>
  
  
Content  
open fun [info](info.md)(msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))  


[androidJvm]  
Brief description  




Log a message at level INFO according to the specified format and argument. 



 This form avoids superfluous object creation when the logger is disabled for the INFO level. 





## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| arg| <br><br>the argument<br><br>
| format| <br><br>the format string<br><br>
  
  
Content  
open fun [info](info.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), arg: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  


[androidJvm]  
Brief description  




Log a message at the INFO level according to the specified format and arguments. 



 This form avoids superfluous object creation when the logger is disabled for the INFO level. 





## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| arg1| <br><br>the first argument<br><br>
| arg2| <br><br>the second argument<br><br>
| format| <br><br>the format string<br><br>
  
  
Content  
open fun [info](info.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), arg1: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), arg2: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  


[androidJvm]  
Brief description  




Log a message at level INFO according to the specified format and arguments. 



 This form avoids superfluous object creation when the logger is disabled for the INFO level. 





## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| argArray| <br><br>an array of arguments<br><br>
| format| <br><br>the format string<br><br>
  
  
Content  
open fun [info](info.md)(format: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), argArray: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>)  


[androidJvm]  
Brief description  


Log an exception (throwable) at the INFO level with an accompanying message.



## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| msg| <br><br>the message accompanying the exception<br><br>
| t| <br><br>the exception (throwable) to log<br><br>
  
  
Content  
open fun [info](info.md)(msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), t: [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html))  


