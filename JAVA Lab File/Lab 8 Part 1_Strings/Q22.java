// 22. Print second word. Let the input is Ram Prasad Dey, output is Prasad.
// Code by Bhavy Kharbanda
//SAP ID: 500082531

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        String a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.nextLine();
        input.close();
        String[] str = a.split(" ");
        System.out.println("Second word is : "+str[1]);
    }
}
