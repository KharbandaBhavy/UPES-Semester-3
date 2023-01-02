
// 18. Write program, which reads a string. 
// Let x and y be respectively left and right neighbors of the second occurrence of the 0th  letter. 
// Find the substring between first occurrence of y and (first occurrence of x after first occurrence of y). e.g. 
// input patkgfmpkst output kgfm. Input pastgksfsptse output tgks. 
// Input raklfrgmcfd output gmcf. Input ywetyykjhtl output ywet.
// Code by Bhavy Kharbanda
//SAP ID: 500082531
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        String a, result;
        int i, x, y, first_y;
        char ch, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        a = input.next();
        input.close();
        ch = a.charAt(0);

        for (i = 1; i < a.length(); i++) {
            if (a.charAt(i) == ch) // Contains index of second x
                break;
        }
        // i contains index of second occurence of 0th letter
        x = i - 1; // left neighbor index
        y = i + 1; // right neighbor index
        b = a.charAt(y); // To find first occurence of y
        first_y = a.indexOf(b);
        result = a.substring(first_y, x + 1);
        System.out.println("Output : " + result);

    }

}
