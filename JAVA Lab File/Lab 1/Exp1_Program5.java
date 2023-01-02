// 5. Write program, which will find sum of product to consecutive digits. e.g. when the input is 23145 the output is 2x3 + 3x1 + 1x4 + 4x5 = 33.
// Code by Bhavy Kharbanda
// SAP ID - 500082531

import java.util.Scanner;
public class Exp1_Program5 
{
    public static void main(String[] args)
    {
        int number,x,y,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of number: ");
        number = input.nextInt();
        while(number>0)
        {
            y=number%10;
            number = number/10;
            x = number%10;
            sum+=y*x;
        }
        
        System.out.println("Result of the program is: ");
        System.out.println(sum);

        input.close();

    }  
}


