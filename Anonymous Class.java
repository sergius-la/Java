// Oracle: https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html

public class Main {

    public static void main(String[] args) {
        final String son = "John Connor";                            
                                       // Create Anonymous Claa
        final Account anonymousClass = new Account("ABS", "Sarah Connor") {

            @Override
            public double getAmount() {
                // Класс захватывает все внешние переменные которые существуют в методе, переменные должны быть final
                System.out.println(son);
                return super.getAmount() + 1000;
            }
        };
    }
}