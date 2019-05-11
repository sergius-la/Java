# Java

Java Version - `java -version` <br>
Run Java programm - `java <file>.class`

# Compile

Compile Java - `javac <file>.java`

```sh
> Compile file
javac 'file name'

> Compile project 
-d destination 
javac 'directory name'/**/*.java -d 'directory name'
javac src/**/*.java -d/build 
```

# Run

```shell
java 'file name'
```

```shell
> Run Program
java -cp 'directory name' 'class name'
java -cp build com.test.humans.Human
```
