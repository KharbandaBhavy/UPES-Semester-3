//3. Write program to exchange first two letters. Let the input string is pwsxtpbcderxrtxgt then output is wpsxtpbcderxrtxgt.
// Code by Bhavy Kharbanda
//SAP ID: 500082531

import java.util.Scanner;

class Q3 {
    public static void main(String args[]) {
        String a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.next();
        char[] b = a.toCharArray();
        char temp = b[0];
        b[0] = b[1];
        b[1] = temp;
        a = new String(b);
        System.out.println("New String : "+ a );
        input.close();
    }

}