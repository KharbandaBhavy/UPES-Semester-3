import java.text.MessageFormat;

public class Basics {

    public static void main(String[] args) {

        //String formatting

        //String s = "Hello World";
        //1. Using printf
        System.out.printf("Hello my name is: %s","Mark");
        System.out.println("Hello");
        //System.out.printf("Hello my age is: %d",25);
        //2. Using String.format() method
        String sVariable = String.format("Hello my age is: %d", 25);
        System.out.println(sVariable);

        //3. Using MessageFormat.format() method
        String msg = MessageFormat.format("{0} | {1} Hello How are you? {2}", 1, 5, 9);
        System.out.println(msg);

        //+ - * / %
        //The percent sign operator (%) is the mod (modulo) or remainder operator.
        //The mod operator (x % y) returns the remainder after you divide x (first number)
        //by y (second number) so 5 % 2 will return 1 since 2 goes into 5 two
        //times with a remainder of 1.
        int y = 8;
        int myInt = y * (10 + 5);
        System.out.println(myInt);

        int x = 5;
        x = x + 5;
        x += 5;

        x += 1;
        x++;
        ++x;

        //Type casting is when you assign a value of one primitive data type to another type.
        //In Java, there are two types of casting:

        //Widening Casting (automatically) - converting a smaller type to a larger type size
        //byte -> short -> char -> int -> long -> float -> double

        //Narrowing Casting (manually) - converting a larger type to a smaller size type
        //double -> float -> long -> int -> char -> short -> byte

        //Casting a double value to an int causes the digits to the right of
        //the decimal point to be truncated (cut off and thrown away).
        //Values of type double can be rounded to the nearest integer by (int)(x + 0.5)
        //or (int)(x – 0.5) for negative numbers.

       // byte b = 5;
       // int myInt2 = b;
        double d = 10.12345;
        int myInt3 = (int) d;
        System.out.println(myInt3);
        char c = 'd';
        int charInInt = c;
        System.out.println("char" + charInInt);

       

        // Still need to specify byte
       // byte b2 = (byte) (b + 4);
        //System.out.printf("Hello my age is: %d",b);

        String color = "green";

        //if statement is the most basic of all control flow statements
        //It tells the program to execute a certain section of code only if particular test
        //evaluates to true
        //This is known as a conditional logic
        // Conditional logic uses specific statements in java to allow us to check a condition
        //and execute certain code based on whether that condition is true or false
        if (color == "red") {
            System.out.println("The color is Red");
        } else if (color == "blue") {
            System.out.println("The color is Blue");
        } else {
            System.out.println("Not known color");
        }

        int grade = 80;

        if (grade <= 80) {
            //System.out.println("Bad Grade");
        }

        // == ,!=, >, <, >=, <=, &&, ||

        //If statements is constructed from if, else if and else

        //if (grade > 70 && grade < 80) {
        //System.out.println("Inside If Statement");
        //}

        if (grade > 70 || (grade < 80 && grade > 75)) {
            System.out.println("Inside If Statement");
        }

        boolean isOver18 = true;
        //no need for brackets since there is one line inside the if statement
        if (!isOver18)
            System.out.println("over 18");

    }
}