// 10.	Write program to find string before 2nd x. Let the input string is pwsxtpbcderxrtxgt then output is: pwsxtpbcder.
// Code by Bhavy Kharbanda
//SAP ID: 500082531
import java.util.Scanner;

public class Q10 {
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
        System.out.println("Second index for x : " + i); // contains the value for second index
        result = a.substring(0,i);
        System.out.println("Output: "+result );

    }
    
}
