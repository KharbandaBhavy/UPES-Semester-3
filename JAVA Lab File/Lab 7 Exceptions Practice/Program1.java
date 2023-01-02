// Code by Bhavy Kharbanda
// SAP Id: 500082531
import java.util.Scanner;

class Program1 {
    public static void main(String args[]) {
        String a, b;
        char c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        a = input.nextLine();
        // a="abc";
        try {
            b = a.substring(2, 5);
            System.out.println(b);
            c = a.charAt(9);
            System.out.println(c);
        } catch (Exception t) {
            System.out.println("The exception is :" + t);
        }
        System.out.println("Hari");
        input.close();
    }
}

/*
 * Explanation: When we input abc it generates exceptions and the given command
 * is not printed because abc has index 0 to 2 while we are requesting to get
 * the string from index 2 to 5 and a character at 9 which is not possible.
 * While when we input abcdef, it shows cde as output. and again throws an
 * exception for the character on 9th index as there is none. But when we input
 * abcdefghijk, no exception is thrown and program runs
 */
