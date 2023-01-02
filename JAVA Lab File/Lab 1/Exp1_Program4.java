// 4. Write program to find sum of all digits. Input 23617 output 2+3+6+1+7=19.
// Code by Bhavy Kharbanda
// SAP ID - 500082531

import java.util.Scanner;
public class Exp1_Program4 
{
    public static void main(String[] args)
    {
        int number, sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of number: ");
        number = input.nextInt();
        while(number>0)
        {
            sum+=number%10;
            number=number/10;
        }
        
        System.out.println("Sum of all the digits is: ");
        System.out.println(sum);

        input.close();

    }  
}
