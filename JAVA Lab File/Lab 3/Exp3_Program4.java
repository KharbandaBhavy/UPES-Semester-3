//4.Write a JAVA program which contains a function fun() such that fun(x) returns x and 
// fun(x,y) returns x + y and fun(x,y,z) returns x*y*z. (where x, y and z are integers).
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.Scanner;
public class Exp3_Program4 
{
    public int fun(int x){
        return x;
    }
    public int fun(int x,int y){
        return (x+y);
    }
    public int fun(int x,int y,int z){
        return x*y*z;
    }
    public static void main(String[] args) {
        Exp3_Program4  num = new Exp3_Program4();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x, y and z: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int a=num.fun(x);
        int b=num.fun(x,y);
        int c=num.fun(x,y,z);
        System.out.printf(" The value of x is: %d",a);
        System.out.printf("\n The value of x+y is: %d",b);
        System.out.printf("\n The value of x*y*z is: %d",c); 
        input.close();
    }
}

