//4. Write program to exchange 4th and 10th letter.  Let the input string is pwsxtpbcderxrtxgt, the output should be pwsxrpbcdetxrtxgt.
// Code by Bhavy Kharbanda
//SAP ID: 500082531

import java.util.Scanner;

class Q4 {
    public static void main(String args[]) {
        String a;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.next();
        char[] b = a.toCharArray();
        char temp = b[4];
        b[4] = b[10];
        b[10] = temp;
        a = new String(b);
        System.out.println("New String : "+ a);
        input.close();
    }

}

