//1. Write program to remove 2nd letter. Let the input string is pwsxtpbcderxrtxgt then output is pwxtpbcderxrtxgt.
// Code by Bhavy Kharbanda
//SAP ID: 500082531

import java.util.Scanner;

class Q1 {
    public static void main(String args[]) {
        String a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to remove the second letter : ");
        a = input.next();
        b = a.substring(0,2);
        c = a.substring(3);
        System.out.println("New String : "+ b+c);
        input.close();
    }
}


