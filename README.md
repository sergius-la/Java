# <img src="/img/java.png" width="24" height="24"> Java

```java
public class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

***

<!-- - [Java docs]() - TODO -->

- [__Java:__ Terminal, Compile, Run](java/Java.md)
- [__Operators__](java/Operators.md)

***

## Data Types

- [__Data conversion__](java/DataConversion.md)

## Functions
- [__main()__](java/functions/Main.md)

***
String adbPath = System.getenv("ANDROID_HOME") + "/platform-tools/adb";
## Data Structure
<!-- - [__array__]() -->
- [__string__](/java/data_structures/String.md)
- [__List\<Type>__](/java/data_structures/List.md)
- [__HashMap\<\<Key>, \<Value>>__](/java/data_structures/List.md)

***

## System

- [__System:__ Env](/java/System.md)
- [__Runtime__](/java/Runtime.md)
- Runtime.getRuntime().exec("/Users/sergey/Library/Android/sdk/platform-tools/adb reboot")

***

<!-- Fix icon size -->
# <img src="/img/testng.jpg" width="24" height="24"> TestNG 

Unit test framework

- [_TestNG docs_](https://testng.org/doc/documentation-main.html)
   - [__@DataProvider__](TestNG/DataProvider.md)

#### Maven

- [_TestNG docs: Maven_](https://testng.org/doc/maven.html)
    - [_Maven repository: TestNG_](https://mvnrepository.com/artifact/org.testng/testng)

```xml
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>6.8</version>
    <scope>test</scope>
</dependency>
```

***

# <img src="/img/maven.png" width="24" height="24"> Maven

- [_Maven docs_](https://maven.apache.org)
- [_Maven repository_](https://mvnrepository.com)
- [__Maven__](/maven/Maven.md)