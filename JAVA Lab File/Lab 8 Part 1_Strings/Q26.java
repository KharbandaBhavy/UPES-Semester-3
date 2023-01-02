// 26. Exchange last letters of first two words. If input is: Ram Prasad Dey, output is: Rad Prasam Dey.
// Code by Bhavy Kharbanda
//SAP ID: 500082531

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        String a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.nextLine();
        input.close();
        String[] str = a.split(" ");
        char[] ch1 = str[0].toCharArray();
        char[] ch2 = str[1].toCharArray(); 
        char temp = ch1[str[0].length()-1];
        ch1[str[0].length()-1] = ch2[str[1].length()-1];
        ch2[str[1].length()-1] = temp;
        str[0] = new String(ch1);
        str[1] = new String(ch2);
        System.out.println("Output is : "+ str[0]+" "+str[1]+" "+str[2]);
    }
}

