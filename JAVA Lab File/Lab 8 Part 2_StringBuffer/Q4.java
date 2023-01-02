// 4. Replace all x’s by y. Input artxuxtxxp output artyuytyyp.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        String a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        a = input.next();
        input.close();
        a=a.replace("x","y");
        System.out.println("Output: "+a);
    }
}
