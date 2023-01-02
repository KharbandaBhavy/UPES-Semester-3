// 27. Find the location of first ‘a’ in second word. If input is, Ram Prasad Dey, output is: 6.
// Code by Bhavy Kharbanda
//SAP ID: 500082531

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        String a;
        int ind,len,result=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.nextLine();
        input.close();
        String[] str = a.split(" ");
        len = str[0].length();
        ind = str[1].indexOf("a");   
        result=len+1+ind;
        System.out.println("Output is : "+result);
    }
}
