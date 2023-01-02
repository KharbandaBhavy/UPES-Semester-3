// 9. Write program to print the string between 1st and 2nd x.  Let the input string is pwsxtpbcderxrtxgt then output is: tpbcder.
// Code by Bhavy Kharbanda
//SAP ID: 500082531
import java.util.Scanner;

public class Q9 {
    public static void main(String args[]) {
        String a,result;
        int i, b;
        char ch = 'x';
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.next();
        input.close();
        b = a.indexOf('x'); //Contains the value for first index
        System.out.println("First Index for x : " + b);
        for (i = b + 1; i < a.length(); i++) {
            if (a.charAt(i) == ch)
                break;
        }
        System.out.println("Second index for x : " + i);
        result = a.substring(b+1,i);
        System.out.println("Output: "+result );

    }
}


