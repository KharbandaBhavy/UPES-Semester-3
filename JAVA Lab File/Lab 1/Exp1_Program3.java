// 3. Write program to print the second digit. e.g. input 23516 the output is 3.
// Code by Bhavy Kharbanda 
// SAP ID - 500082531

import java.util.Scanner;
public class Exp1_Program3 
{
    public static void main(String[] args)
    {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of number: ");
        number = input.nextInt();
        while(number>100)
        {
            number=number/10;
        }
        
        System.out.println("Second digit is: ");
        System.out.println(number%10);

        input.close();

    }  
}
