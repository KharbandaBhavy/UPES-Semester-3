// 17. Write program to replace first occurrence of right neighbor of 2nd x by left neighbor of 1st x. 
// Input imgpxugxutkl output imgpxpgxutkl. Input bcxdefxgh output bcxdefxch.
// Code by Bhavy Kharbanda
//SAP ID: 500082531
import java.util.Scanner;

public class Q17 {
    public static void main(String args[]) {
        String a;
        int i, ind,first_left, right, first_right;
        char ch = 'x',b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.next();
        input.close();
        ind = a.indexOf('x');                                 //Contains the value for first index
        
        first_left = ind-1;                                   //Contains left neighbor of first x
        for (i = ind + 1; i < a.length(); i++) {
            if (a.charAt(i) == ch)                            //Contains index of second x
                break;
        }
        right = i+1;                                          //Contains index of right neighbor of second x
        //For finding first occurence
        b = a.charAt(right);
        first_right = a.indexOf(b);
        //To replace first_right by first_left
        char[] charar = a.toCharArray();
        charar[first_right]=charar[first_left];
        a = new String(charar);
        System.out.println("Output : " + a); 

    }
    
}
