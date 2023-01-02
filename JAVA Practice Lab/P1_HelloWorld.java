import java.util.Scanner;


public class P1_HelloWorld {
public static void main(String[] args) 
{
    Scanner input=new Scanner(System.in);
    System.out.println("Hello World");
    System.out.println("Enter the integer : ");
    int x=input.nextInt();
    System.out.println("Enter input is "+x);
    System.out.println("Enter Floating number: ");
    float y= input.nextFloat();
    System.out.println("Float number is "+y);
    //String first = "This is my first java program";
    //System.out.println(first);
    input.close();
}
    
}
