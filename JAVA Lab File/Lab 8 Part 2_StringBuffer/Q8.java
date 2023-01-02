// 8. Suppose string has words. e.g. Ram is a good boy. Find first and second word.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        String a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String : ");
        a = input.nextLine();
        input.close();
        String[] str = a.split(" ");
        System.out.println("First word is: " + str[0]);
        System.out.println("Second word is: " + str[1]);

    }

}
