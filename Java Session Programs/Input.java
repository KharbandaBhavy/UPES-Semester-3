// Package for standard input.
import java.util.Scanner;

public class Input 
{
    public static void main(String[] args)
    {
        // This was not a standard input method.
        //We used the terminal for this purpose.
        //System.out.println("Hello "+ args[0]);

        //Standard scanner
        Scanner input = new Scanner(System.in);
        int x;
        float y;
        String z;
        System.out.println("Enter the integer x: ");
        x = input.nextInt();
        System.out.println("Enter the float y: ");
        y = input.nextFloat();
        System.out.println("Enter the String z: ");
        z = input.next();
        
        System.out.println("X = " +x);
        System.out.println("Y = " +y);
        System.out.println("Z = " +z);
        input.close();
    }
}
