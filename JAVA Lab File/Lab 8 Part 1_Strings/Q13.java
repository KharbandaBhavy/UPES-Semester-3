//13. Write program to exchange neighbors of first x. Let the input string is pwsxtpbcderxrtxgt then output is: pwtxspbcderxrtxgt.
// Code by Bhavy Kharbanda
//SAP ID: 500082531
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        String a;
        int ind;
        char ch = 'x';
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.next();
        ind=a.indexOf(ch);
        input.close();

        char[] charar = a.toCharArray();
        char temp = charar[ind+1];
        charar[ind+1] = charar[ind-1];
        charar[ind-1] = temp;
        a = new String(charar);

        System.out.println("Index of first x : "+ind);
        System.out.println("Output String : "+a);
    }
}
