// 24. Exchange first and second word. In input is Ram Prasad Dey, output is:  Prasad Ram Dey.
// Code by Bhavy Kharbanda
//SAP ID: 500082531

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        String a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.nextLine();
        input.close();
        String[] str = a.split(" ");
        System.out.println("Output is : " + str[1] +" "+ str[0]+" "+str[2]);
    }
}
