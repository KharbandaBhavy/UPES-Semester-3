// 7. Find length of the string. (Do not use length())
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        String a;
        int count=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String :");
        a = input.nextLine();
        input.close();
        for(char ch: a.toCharArray()){
            count++;
        }
        System.out.println("Length of string : "+ count);
    }  
}
