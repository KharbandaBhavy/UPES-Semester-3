// 6. Whether given string is a Palindrome. A Palindrome is word which remains same when reversed. e.g. malayalam. 
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        String a;
        int i,j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        a = input.next();
        input.close();
        j = a.length()-1;
        for(i=0;i<j;)
        {
            if (a.charAt(i) != a.charAt(j)){
                System.out.println("It is not a Palindrome");
                j--;}
                
            else{
                System.out.println("It is a Palindrome");}
                break;    
        }
    }
}
