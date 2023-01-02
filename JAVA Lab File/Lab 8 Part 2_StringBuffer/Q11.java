// 11.	Find last letter of first word. Input is Ram is a good boy, Output: m.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        String a;
        char ch;
        int ind;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String : ");
        a = input.nextLine();
        input.close();
        String[] str = a.split(" ");
        ind = str[0].length();
        ch = a.charAt(ind-1);
        System.out.println("Output is : "+ch);
    }  
}
