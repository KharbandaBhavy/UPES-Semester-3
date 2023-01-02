// 1. Read a string of two (distinct) integers. Output bigger Integer. Do not use "if".
// Code by Bhavy Kharbanda
// SAP ID: 500082531


import java.util.*;

class Q1 {
   
    public static void main(String args[]) {
        int a, b, c;
        String str1, str2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string :");
        str1 = input.nextLine();
        a=Integer.parseInt(str1);
        System.out.println("Enter Second string :");
        str2 = input.nextLine();
        b=Integer.parseInt(str2);
        c = a-b;
        try {
            int [] arr = new int[a+b];
            arr[c] = c;
            System.out.println("Bigger number is : " + a);
        } catch (Exception e) {
            System.out.println("Bigger number is: " + b);
        }
        input.close();
    }
}

