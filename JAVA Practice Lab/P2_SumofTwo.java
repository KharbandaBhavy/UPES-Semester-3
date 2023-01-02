import java.util.Scanner;

public class P2_SumofTwo {
   public static void main(String[] args) {
       int x,y;
       Scanner input =new Scanner(System.in);
       System.out.print("Enter the value of x and y :");
       x=input.nextInt();
       y=input.nextInt();
       int result =x+y;
       System.out.println("Result: "+result);
    input.close();
   } 
}

