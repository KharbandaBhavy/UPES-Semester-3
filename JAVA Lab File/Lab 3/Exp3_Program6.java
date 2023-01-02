// 6. Write a set of overloaded functions power() that returns the X^n where n is integer and X may be int and float.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.lang.Math;

public class Exp3_Program6 
{
    public int power(int x, int n) 
    {
        double a = (double) x;
        double b = (double) n;
        double temp = Math.pow(a,b);
        int result = (int) temp;
        return result;
    }
    public double power(double x, int n) 
    {    
        return Math.pow(x, n);
    }
    public static void main(String[] args) {
        Exp3_Program6 num = new Exp3_Program6();
        int a = num.power(5,2);
        double b = num.power(5.2,2);
        System.out.printf(" The value of x^n where x is int is: %d", a);
        System.out.printf("\n The value of x^n where x is float is: %.4f", b);
    }
}
