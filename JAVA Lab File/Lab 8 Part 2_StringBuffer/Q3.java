//3. Read a string and replace second x by y. Input artxuxtxxp output artxuytxxp.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        String a;
        StringBuffer str;
        int i, b;
        char ch = 'x';
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.next();
        input.close();
        str = new StringBuffer("");
        str.append(a);
        b = a.indexOf('x'); //Contains the value for first index
        System.out.println("First Index for x : " + b);
        for (i = b + 1; i < a.length(); i++) {
            if (a.charAt(i) == ch)
                break;
        }
        System.out.println("Second index for x : " + i);
        str.replace(i,i+1,"y");
        a = str.toString();
        System.out.println("Output: " + a);
    }
}
