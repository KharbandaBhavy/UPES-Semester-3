//6. Write a program, which reads a string and finds string after the first x. 
//Let the input string is pwsxtpbcderxrtxgt then output is tpbcderxrtxgt.
// Code by Bhavy Kharbanda
//SAP ID: 500082531

import java.util.Scanner;

public class Q6 {
    public static void main(String args[]) {
        String a,b;
        int i;
        char ch = 'x';
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.next();
        input.close();
        for (i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ch)
            break;
        }
        b = a.substring(i+1);
        System.out.println("New String : " + b);
        input.close();

    }
}
