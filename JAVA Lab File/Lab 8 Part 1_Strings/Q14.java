
//14. Write program to find 2nd location of 0th letter. Input pwerpty output 4.
// Code by Bhavy Kharbanda
//SAP ID: 500082531
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

        String a;
        int i;
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.next();
        input.close();
        ch = a.charAt(0);
        System.out.println("0th letter : " + ch); 
        for (i =  1; i < a.length(); i++) {
            if (a.charAt(i) == ch)
                break;
        }
        System.out.println("2nd Location of 0th letter : " + i); 
    }
}


