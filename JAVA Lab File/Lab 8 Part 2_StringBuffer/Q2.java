// 2. Replace last x by y. Input artxuxtxxp output artxuxtxyp.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        StringBuffer b;
        String a;
        int ind;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        a = input.next();
        input.close();
        b = new StringBuffer("");
        b.append(a);
        b.reverse();
        ind = b.indexOf("x");
        b.replace(ind, ind + 1, "y");
        b.reverse();
        a = b.toString();
        System.out.println("Output: " + a);

    }
}
