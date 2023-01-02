// 3. Read a string of two number. Output 1 if first number is bigger, output 2 if second number is bigger, output 0 if they are equal. Do not use "if".
// Code by Bhavy Kharbanda
// SAP ID: 500082531
import java.util.*;

class Q3 {
    
    public static void main(String args[]) {
        int a, b, c, d;
        String str1, str2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string :");
        str1 = input.nextLine();
        a=Integer.parseInt(str1);
        System.out.println("Enter Second string :");
        str2 = input.nextLine();
        b=Integer.parseInt(str2);
        c = a-b;
        try{
            d = 1/(a-b);
        try {
            int [] arr = new int[a+b];
            arr[c] = c;
            System.out.println("Output: 1");
        } catch (Exception e) {
            System.out.println("Output: 2");
        }
    }catch(ArithmeticException e){
        System.out.println("Output: 0");
    }
        input.close();
    }
}


