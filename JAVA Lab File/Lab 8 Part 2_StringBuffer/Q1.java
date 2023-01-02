// 1. Read a string and replace first x by y. Input artxuxtxxp output artyuxtxxp.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.Scanner;

public class Q1{
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
        ind = a.indexOf("x");
        b.replace(ind,ind+1,"y");
        a = b.toString();
        System.out.println("Output: "+a);
        
    }
}

