// 7. Write program to print positional values of digits. Input 21463 output 3, 60, 400, 1000 and 20000.
// Code by Bhavy Kharbanda
// SAP ID - 500082531

import java.util.Scanner;

public class Exp1_Program7 {
    public static void main(String[] args) {
        int number, a, b = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of number: ");
        number = input.nextInt();
        System.out.println("Positional values are: ");
        while (number > 0) {
            a = number % 10;
            a = a * b;
            System.out.println(a);
            b = b * 10;
            number = number / 10;

        }

        input.close();

    }
}
