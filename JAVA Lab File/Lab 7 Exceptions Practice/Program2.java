// Code by Bhavy Kharbanda
// SAP Id: 500082531

public class Program2 {
    public static void main(String[] args) {
        int a, b, c, d, e;
        a = 25; b = 4; c = 0; d = 3;
        try {
            e = a / b;
            System.out.println(e);
        } catch (ArithmeticException t) {
            System.out.println("Error");
        }
        try {
            e = a / c;
            System.out.println(e);
        } catch (ArithmeticException t) {
            System.out.println("Error");
        }
        try {
            e = a / d;
            System.out.println(e);
        } catch (ArithmeticException t) {
            System.out.println("Error");
        }
    }
}

/* If we don't apply the try and catch block in any of the statement the program
 * will show a/b i.e 6 as the output and then terminates with the exception
 * can't divide by zero and even the third statement won't execute, while on the
 * other hand if we use the try and catch block for all the statements
 * sparately, it executes the 1st stement then catches an exception for the
 * second and shows "error" and then executes the third statment and program
 * terminates smoothly.
 */
