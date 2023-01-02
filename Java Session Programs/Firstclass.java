public class Firstclass {
    public static void main(String[] args) {
        //Variables are a way to store information on our computer.
        //We can access variables that we define in the program by the name
        //we are giving them
        //When we access a variable the computer is figuring out by himself
        //where the variable is stored on the RAM and gets the value from there
        //a variable value can be changed during the program
        //To create a variable:
        //1. Identify the type
        //2. Give a name
        //3. optional- Give a value (the value is usually a literal)

        //Creating a variable is also called declaring a variable.
        //Giving it a value for the first time is also called initialization

        //While you can name your variable almost anything, there are some rules.
        //A variable name should start with an alphabetic character (like a, b, c, etc.)
        // and can include letters, numbers, and underscores _.
        // It must be all one word with no spaces.
        //Use meaningful variable names!
        //Start variable names with a lowercase letter and use camelCase.
        //Variable names are case-sensitive and spelling sensitive!
        // Each use of the variable in the code must match the variable name in the declaration
        // exactly.
        //Never put variable name inside quotes

        //we can define our variables by lot of different types, those are called data types.
        //All the data types are keywords
        //int- abbreviation for integer, a whole number without any decimal points

        //String literal- sny sequence of characters surrounded by double quotes
        //is a String literal in Java. It's value can't be changed unlike a variable.

        String myInt="Hello";
        //System.out.println("My int: " +myInt);
        //myInt=20;
        System.out.println(myInt);

        int mySecondInt= 10-5*3;
        System.out.println(mySecondInt);
        // Operators perform an operation on a variable or value.
        // + - * / most common operators

        //The percent sign operator (%) is the mod (modulo) or remainder operator.
        //The mod operator (x % y) returns the remainder after you divide x (first number)
        //by y (second number) so 5 % 2 will return 1 since 2 goes into 5 two
        //times with a remainder of 1.

        int moduloResult= 5%3;
        System.out.println(moduloResult);

        //In Java primitive types are the most basic data types, there are 8 of them:

        //When you create a primitive variable Java will set aside enough bits in memory
        //for that primitive type and associate that memory location with the name that
        //you used.

        //There are two types of variables in Java: primitive variables that hold primitive
        //types and object variables that hold a reference to an object of a class.
        //A reference is a way to find the object
        // (like a UPS tracking number helps you find your package).

        byte b= 1;
        char c= 'a';
        char unicode= '\u0045';
        short s=120;
        long l=999999999l;
        float f= 50.50f;
        double d= 999.6666;

        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(unicode);

        //Wrapper classes- each one of the primitive types has a wrapper class like Integer
        //Boolean Long etc.. the wrapper class gives us a way to perform operations on the data type
        int maxInt=Integer.MAX_VALUE;
        System.out.println(maxInt);
        System.out.println(Integer.MIN_VALUE);
        int withUnderscore= 5_000_000;
        System.out.println(withUnderscore);
    }
}


