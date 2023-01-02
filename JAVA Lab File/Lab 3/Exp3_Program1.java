// 1. Write a JAVA program which contains a function square() such that square(3) returns 9, square(0.2) returns 0.04.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

public class Exp3_Program1 
{
    public int square(int n){
        return n*n;
    }
    public double square(double n){
        return n*n;
    }
    public static void main(String[] args) {
        Exp3_Program1 num=new Exp3_Program1();
        int a=num.square(3);
        double b=num.square(0.2);
        System.out.printf("The square of integer number is : %d",a);
        System.out.printf("\nThe square of float number is : %.2f",b);

    }
    public double cube(double d) {
        return 0;
    }
}




