// 9.Find the first word of 4 letters. if the input is Ram is a good boy, output: good.
// Code by Bhavy Kharbanda
// Sap Id: 500082531
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        String a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String : ");
        a = input.nextLine();
        input.close();
        String[] str = a.split(" ");
        for(int i=0;;i++)
        {
            if(str[i].length()==4){
                System.out.println("Word with 4 letters : "+str[i]);

            }
        }
    }
}

