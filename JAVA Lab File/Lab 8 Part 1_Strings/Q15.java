//15. Write program, which will delete 1st y immediately after 1st x. If input string is pgyeryuyixaysdyexer then output is pgyeryuyixasdyexer.
// Code by Bhavy Kharbanda
//SAP ID: 500082531
import java.util.Scanner;


public class Q15 {
    public static void main(String[] args) {
        String str,a,b;
        int i,first;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        str = input.next();
        input.close();
        first = str.indexOf('x');
        System.out.println("First x is at : " + first); 
        for (i =  first; i < str.length(); i++) {
            if (str.charAt(i) == 'y')
                break;
        }
        a=str.substring(0,i);
        b=str.substring(i+1);
        System.out.println("Output is : " + a+b);
    }    
}


