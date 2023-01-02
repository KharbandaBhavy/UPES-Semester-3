// 2. Write a program to print first digit. e.g. input 23516 output 2.
// Code by Bhavy Kharbanda
// SAP ID - 500082531

import java.util.Scanner;
public class Exp1_Program2 
{
    public static void main(String[] args)
    {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of number: ");
        number = input.nextInt();
        while(number>10)
        {
            number=number/10;
        }
        
        System.out.println("First digit is: ");
        System.out.println(number%10);

        input.close();

    }    
}


