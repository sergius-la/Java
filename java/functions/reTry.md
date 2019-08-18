# [_Stack Overflow: re-try-catch_](https://stackoverflow.com/questions/13239972/how-do-you-implement-a-re-try-catch)

```java
public class SimpleReTry {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            try {
                System.out.println(String.format("I: Attempt #%s", i));
                throwException();
                break;
            } catch (RuntimeException exception) {
                if (exception.getMessage().equals("Try")) {
                    System.out.println(String.format("W: Attempt FAILS #%s", i));
                    if (i == 3) {
                        throw new RuntimeException(
                                String.format("Try FAILS %S", i));
                    }
                } else {
                    throw exception;
                }
            }
        }
    }
    public static void throwException() {
        throw new RuntimeException("Try");
    }
}
```