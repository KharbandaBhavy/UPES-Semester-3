// 5. Write program to insert ‘t’ between 1st and 2nd letter. Let the input string is pwsxtpbcderxrtxgt, the output is: ptwsxrpbcdetxrtxgt.
// Code by Bhavy Kharbanda
//SAP ID: 500082531

import java.util.Scanner;

class Q5 {
    public static void main(String args[]) {
        String a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.next();
        b = a.substring(0,1);
        c= a.substring(1);
        System.out.println("New String : "+ b+"t"+c );
        input.close();
    }

}
