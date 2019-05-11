# Maven

## Run tests

Run tests <br>
`mvn test compile`

Run tests with TestNG <br>
`mvn test -P<nameTest>.xml`

## Maven dependency

```xml
<dependencies>

    <!-- https://mvnrepository.com/artifact/io.appium/java-client -->
    <dependency>
        <groupId>io.appium</groupId>
        <artifactId>java-client</artifactId>
        <version>5.0.4</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/junit/junit -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
        <scope>test</scope>
    </dependency>

</dependencies>
```