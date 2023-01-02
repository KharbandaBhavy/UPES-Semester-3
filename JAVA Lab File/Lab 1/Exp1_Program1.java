// 1. Write program to print the kth digit from last. e.g. input 23617 and k=4 output 3.
// Code by Bhavy Kharbanda
// SAP ID - 500082531
import java.util.Scanner;
public class Exp1_Program1 
{
    public static void main(String[] args)
    {
        int number, k;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of number and k: ");
        number = input.nextInt();
        k = input.nextInt();
        for(int i=0;i<k-1;i++)
        {
            number=number/10;
        }
        System.out.println("kth digit is: ");
        System.out.println(number%10);

        input.close();

    }

}


