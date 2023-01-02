/* 
5.You are required to compute the power of a number by implementing a calculator. 
Create a class Calc which consists of a single method long power(int, int). 
This method takes two integers, a and b, as parameters and finds a^b. 
If either a or  b is negative, then the method must throw an exception which says "a and b should not be negative". 
Also, if both a and b are zero, then the method must throw an exception which says "a and b should not be zero"
For example, -4 and -5 would result in  java.lang.Exception: a and b should not be negative.
Complete the function power in class Calc and return the appropriate result after the power operation or an appropriate exception as detailed above.
*/
// Code by Bhavy Kharbanda
// SAP ID: 500082531

import java.util.Scanner;
import java.lang.Math;

class Calc {
    public long power(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("a or b should not be Negative.");
        } else if (a == 0 && b == 0) {
            throw new Exception("a and b should not be Zero.");
        }
        return (long)Math.pow(a, b);
    }
}

public class Exp7_Program5 {
    public static void main(String[] args) {
        Calc obj = new Calc();
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Enter value of a and b to get a^b :");
        a = input.nextInt();
        b = input.nextInt();
        input.close();
        try{
            System.out.println(obj.power(a,b));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


