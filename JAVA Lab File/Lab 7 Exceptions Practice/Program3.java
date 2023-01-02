// Code by Bhavy Kharbanda
// SAP Id: 500082531

import java.util.Scanner;
public class Program3 {
    private static int read1() {
        int i = 2;
        String a;
        try {
            Scanner input = new Scanner(System.in);
            a = input.nextLine();
            i = Integer.parseInt(a);
            input.close();
        } catch (Exception t) {
            System.out.println("Not a number\n " + t);
        }
        return i;
    }

    public static void main(String args[]) {
        int i, a, f[] = { 8, 12, 34, 16 };
        a = read1();
        try {
            System.out.println(f[a]);
            i = 25 / 0;
            System.out.println(i);
        } catch (Exception t) {
            System.out.println("stop" + t);
        }
        /*
         * catch (ArrayIndexOutOfBoundsException t) {
         * System.out.println("Illegal Memory reference"+t);
         * }catch (ArithmeticException t) {
         * System.out.println("Wrong Division"+t);
         * }
         */
    }
}
