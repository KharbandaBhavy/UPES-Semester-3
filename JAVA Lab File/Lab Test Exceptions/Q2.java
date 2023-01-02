// 2. Read a string of two (distinct) floats. Output bigger number. Do not use "if".
// Code by Bhavy Kharbanda
// SAP ID: 500082531

import java.util.*;

class Q2 {
   
    public static void main(String args[]) {
        float a, b;
        int c, value;
        String str1, str2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string :");
        str1 = input.nextLine();
        a=Float.parseFloat(str1);
        System.out.println("Enter Second string :");
        str2 = input.nextLine();
        b=Float.parseFloat(str2);
        c = (int)a/(int)b;
        try {
            value = 1/c;
            System.out.println("On dividing int part it gives: " +value);
            System.out.println("Bigger number is : " + a);
        } catch (Exception e) {
            System.out.println("Bigger number is: " + b);
        }
        input.close();  
    }
}

