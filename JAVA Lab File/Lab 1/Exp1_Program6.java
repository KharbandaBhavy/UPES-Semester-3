// 6.Write program, which reads two number (assume that both have same number of digits). 
// The program outputs the sum of product of corresponding digits. Input 327 and 539 output 3x5+2x3+7x9=84. 
// Code by Bhavy Kharbanda
// SAP ID - 500082531

import java.util.Scanner;
public class Exp1_Program6 
{
    public static void main(String[] args)
    {
        int number1, number2,a,b, sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of number 1: ");
        number1 = input.nextInt();
        System.out.println("Enter the value of number 2: ");
        number2 = input.nextInt();
        while(number1>0)
        {
            a = number1%10;
            b = number2%10;
            sum+=a*b;
            number1 = number1/10;
            number2 = number2/10;
        }
        
        System.out.println("Sum of product of digits is: ");
        System.out.println(sum);

        input.close();

    }  
}





