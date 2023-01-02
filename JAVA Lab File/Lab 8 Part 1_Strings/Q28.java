// 28. Find location of first letter of first word in second word. Input is ram prasad dey, output: 5.
// Code by Bhavy Kharbanda
//SAP ID: 500082531

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        String a;
        int ind,len,result=0;
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.nextLine();
        input.close();
        String[] str = a.split(" ");
        ch = a.charAt(0);
        ind = str[1].indexOf(ch);
        len = str[0].length();
        result = len+1+ind;
        System.out.println("Output is : "+result);
    }
}

