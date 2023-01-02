// 20.	Read two string. Print 1 if first string is bigger, 2 if second string is bigger, 0 if both are same.
// Code by Bhavy Kharbanda
//SAP ID: 500082531

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        String a, b;
        int a_len, b_len;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        a = input.next();
        System.out.println("Enter the Second string : ");
        b = input.next();
        input.close();
        a_len = a.length();
        b_len = b.length();
        if (a_len > b_len) {
            System.out.println("1");
        } else if (a_len < b_len) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }

    }

}
