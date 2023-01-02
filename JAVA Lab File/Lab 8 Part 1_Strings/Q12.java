
// 12. Program to exchange the string between 1st and 2nd x, with the string before 1st x. 
// Let the input string is pwsxtpbcderxrtxgt then output is: tpbcderxpwsxrtxgt.
// Code by Bhavy Kharbanda
//SAP ID: 500082531
import java.util.Scanner;

public class Q12 {
    public static void main(String args[]) {
        String a, n1, n2, org1,org2;
        int i, b;
        char ch = 'x';
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.next();
        input.close();
        b = a.indexOf('x'); // Contains the value for first index
        n1 = a.substring(0, b);

        System.out.println("First Index for x : " + b);
        for (i = b + 1; i < a.length(); i++) {
            if (a.charAt(i) == ch)
                break;
        }
        System.out.println("Second index for x : " + i); // contains the value for second index
        n2 = a.substring(b + 1, i);
        org1= a.substring(b,b+1);
        org2 = a.substring(i);
        System.out.println("Output: " + n2+org1+n1+org2);
    }
}
