// 3. Write a code to create your own exception class. Create another class. 
// Inside main method prompt user to enter a number, if number is less than 500, throw instances of your custom exception class.
// Code by Bhavy Kharbanda
// SAP ID: 500082531

import java.util.Scanner;

class MyException extends Exception {
    public MyException(String S) {
        super(S);
    }
}

public class Exp7_Program3 {
    public static void main(String args[]) throws MyException {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        try {
            num = input.nextInt();
            input.close();
            if (num < 500) {
                throw new MyException("Exception Alert!!! You have entered an integer less than 500 ");
            } else {
                System.out.println("You can go ahead.....");
            }
        } catch (MyException Ex) {
            System.out.println(Ex.getMessage());
        }

    }
}
