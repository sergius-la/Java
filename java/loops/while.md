# While

```java
// -- While loop Syntax 

int count = 0;

      //Condition       
while (count != 5) {
    System.out.println("Count value is " + count);
    count ++;
}


//Another way
int count = 0;

while (true) {
    //Check Condition                   
    if (count == 5) {
        break;
    }
           
    System.out.println("Count value is " + count);
    count ++;
}



//Loop по сдвиганию в цифры int, повторится столько сколько цифр в числе 

        int num = 1250;

        while (num > 0) {

            System.out.println(num); //Ineration: (1) - 1250; (2) - 125; (3) = 12; (4) = 1; 

            num = num / 10;
        }
        
        
        
//Count all digits in Int, for positive Int

        int num = 111;
        int sum = 0;

        while (num > 0) {

            int digit = num % 10;
            sum += digit;

            num = num / 10;
        }

        System.out.println(sum); //3
```

# Do While 

```java
// -- Do While loop -- //


//Do While Execute at least once
int count = 0;

do {
    System.out.println("Count value wsa " + count);
    count ++;
    
    //Check Condition
    if (count > 3) {
        break;
    }
  
        //Condition   
} while (count != 6);
```