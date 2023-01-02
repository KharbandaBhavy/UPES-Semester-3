// 5. Find the number of x’s. Input artxuxtxxp output 4.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        String a;
        char ch='x';
        int i,count=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        a = input.next();
        input.close();
        for(i=0;i<a.length();i++)
            if(a.charAt(i)==ch)
                count++;
        System.out.println("Count of x's : "+count);        
        
    }
}
