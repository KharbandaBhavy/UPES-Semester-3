// 7. Write program to replace first x by y. Let the input string is pwsxtpbcderxrtxgt then output is pwsytpbcderxrtxgt.
// Code by Bhavy Kharbanda
//SAP ID: 500082531
import java.util.Scanner;

public class Q7 {
    public static void main(String args[]) {
        String a,b,c;
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
        b = a.substring(0,i);
        c = a.substring(i+1);
        System.out.println("New String : " + b+"y"+c);


    }
}
