//3.Write a JAVA program which contains a function fun() such that fun(x) returns x^2 and fun(x,y) returns x^2 + y^2. (where x and y are integers).
//Code by Bhavy Kharbanda
//Sap Id: 500082531

import java.util.Scanner;
public class Exp3_Program3 
{
    public int fun(int x){
        return x*x;
    }
    public int fun(int x,int y){
        return (x*x)+(y*y);
    }
    public static void main(String[] args) 
    {
        Exp3_Program3 num=new Exp3_Program3();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x and y: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int a=num.fun(x);
        int b=num.fun(x,y);
        System.out.printf("The value of x^2 is: %d",a);
        System.out.printf("\nThe value of x^2 + y^2 is: %d",b);
        input.close();
    }
}


