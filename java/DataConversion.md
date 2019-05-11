# Data conversion

## int

#### int -> String

```java
// Integer.toString()
int number = 193_019;
String numberString = Integer.toString(number);

// String.format()
int number = -782;
String numberAsString = String.format ("%d", number);
```

## char

#### char -> String
```java
Character.toString(char);
```

## String

#### String -> int
```java
String numberAsString = "2018";
int number = Integer.parseInt(numberAsString);
```

#### String -> double
```java
String numberAsString = "20.18";
double number = Double.parseDouble(numberAsString);
```

#### String -> char[]
```java
// String.toCharArray()
String str = "String";
char[] arrayChar = str.toCharArray();
```

## int[]

#### int[] -> String

```java
int[] x = {3,4,5};
String s = Arrays.toString(x).replaceAll("[\\,\\[\\]\\ ]", "");

String s = IntStream.of(x)
  .mapToObj(Integer::toString)
  .collect(Collectors.joining(""));
```

#### int[] -> Integer[]

```java
int[] arr = {0, 1, 1, 1, 1 ,1 , 1, 33, 4, 43, 54, 32, 32, 32 , 54, 23, 55};
Integer[] intFirst = Arrays.stream( arr ).boxed().toArray(Integer[]::new);
```

## char[]

#### char[] -> String

```java
char[] data = {'a', 'b', 'c'};
String text = String.valueOf(data);
```

## List\<Character>

#### List\<Character> -> String
```java
List<Character> listChar = new ArrayList<Character>();
String str = listChar.stream().map(e->e.toString()).collect(Collectors.joining());
```

## List\<Integer>

#### List\<Integer> -> int[] Array
```java
List<Integer> result = new ArrayList<Integer>();
result.stream().mapToInt(i->i).toArray();
```

## String[]

#### String[] -> Set<String>

```java
String [] countries = {"India", "Switzerland", "Italy", "India"}; 
Set<String> set = new HashSet<String>(Arrays.asList(countries));
```
