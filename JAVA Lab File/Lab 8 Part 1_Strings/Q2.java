//2. Write program to add 0th letter in the beginning. Let the input string is pwsxtpbcderxrtxgt then output is ppwsxtpbcderxrtxgt.
// Code by Bhavy Kharbanda
//SAP ID: 500082531

import java.util.Scanner;

class Q2 {
    public static void main(String args[]) {
        String a;
        char c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to Manipulate : ");
        a = input.next();
        c = a.charAt(0);
        System.out.println("New String : "+ c+a);
        input.close();
    }
}

