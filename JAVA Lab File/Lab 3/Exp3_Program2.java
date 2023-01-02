// 2. Write a JAVA program which contains a function cube() such that cube(3) returns 27, cube(0.2) returns 0.008.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

public class Exp3_Program2 
{
    public int cube(int n){
        return n*n*n;
    }
    public double cube(double n){
        return n*n*n;
    }
    public static void main(String[] args) {
        Exp3_Program2 num=new Exp3_Program2();
        int a=num.cube(3);
        double b=num.cube(0.2);
        System.out.printf("The cube of integer number is : %d",a);
        System.out.printf("\nThe cube of float number is : %.4f",b);

    }    
}
