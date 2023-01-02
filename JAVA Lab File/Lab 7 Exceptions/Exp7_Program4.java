// 4. You are given two integers, a and b as input, you have to compute a/b: 
// If a and b are not bit signed integers or if is zero, exception will occur and you have to report it. 
// Code by Bhavy Kharbanda
// SAP ID: 500082531

import java.util.*;

public class Exp7_Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        try{
        try{
            System.out.println("Enter two number for Division: ");
            x = input.nextInt();
            y = input.nextInt();
            input.close();
            System.out.println(x/y);
        }catch (InputMismatchException e){
            System.out.println(e);
        }
            
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}

