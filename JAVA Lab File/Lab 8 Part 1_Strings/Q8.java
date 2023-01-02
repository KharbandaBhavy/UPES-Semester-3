//8. Write program to output the location of second x. Let the input string is pwsxtpbcderxrtxgt then output is: 11.
// Code by Bhavy Kharbanda
//SAP ID: 500082531
import java.util.Scanner;

public class Q8 {
    public static void main(String args[]) {
        String a;
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
    }
}
