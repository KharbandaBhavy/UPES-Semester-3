//16. Write program to exchange neighbors of first occurrence of left neighbors of first ‘x’. e.g. 
// Input abcdefxgh output abcdxfegh. input abfcdefxgh output acfbdefxgh. 
// Code by Bhavy Kharbanda
//SAP ID: 500082531
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        String a;
        int ind,new_ind,final_ind;
        char ch = 'x',b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.next();
        ind=a.indexOf(ch);
        input.close();
        new_ind = ind-1;               //Index of Left neighbour of x
        b = a.charAt(new_ind);         //To find the char at that index
        final_ind = a.indexOf(b);      //To find it's first occurence
        char[] charar = a.toCharArray();
        char temp = charar[final_ind+1];
        charar[final_ind+1] = charar[final_ind-1];
        charar[final_ind-1] = temp;
        a = new String(charar);

        System.out.println("Output String : "+a);
    }
}


