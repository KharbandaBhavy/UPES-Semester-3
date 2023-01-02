// 10.	Remove all blanks. If input is Ram is a good boy, output: Ramisagoodboy.
// Code by Bhavy Kharbanda
// Sap Id: 500082531
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        String a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String : ");
        a = input.nextLine();
        input.close();
        a = a.replace(" ","");
        System.out.println("New String is : "+a);
    }
}

