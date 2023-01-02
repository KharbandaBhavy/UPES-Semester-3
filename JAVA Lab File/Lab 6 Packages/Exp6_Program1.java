// 1. Write a Java program to implement the concept of importing classes from user defined package and created packages.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import Calculator.test;
import java.util.Scanner;

public class Exp6_Program1 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        test obj = new test();
        System.out.println("Enter two numbers to use the calculator operations: ");
        a = input.nextInt();
        b = input.nextInt();
        obj.add(a, b);
        obj.sub(a, b);
        obj.mult(a, b);
        obj.divide(a, b);
        input.close();
    }

}