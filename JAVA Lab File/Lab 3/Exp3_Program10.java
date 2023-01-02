// 10.Define Comp conjugate()  e.g.conjugate(2+3i) is 2-3i
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.Scanner;
class Comp2{
    public String conjugate(String s){
        String str1=s;

        if (s.indexOf("-") != -1){
            str1=str1.replace("-", "+");
            return str1;
        }else if(s.indexOf("+") != -1){
            str1=str1.replace("+", "-");
            return str1;
        }else{
            System.out.println("***Invalid Input***");
            return null;
        }
        
    }
}
public class Exp3_Program10 {
    public static void main(String[] args) {
        Comp2 text=new Comp2();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the complex number as real (+/-) imgaginary part (i)");
        String str = input.nextLine();
        String result = text.conjugate(str);
        System.out.println("The Value of the conjugate is: "+result);
        input.close();
    }
}