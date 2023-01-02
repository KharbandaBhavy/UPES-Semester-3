// Code by Bhavy Kharbanda
// SAP Id: 500082531

//import java.io.IOException;
//import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        int i;
        float x,y,k,l;
        String a="",b;
       /* try{ 
            Scanner input =new Scanner(System.in);
            a=input.nextLine();
            input.close();
            a=a.trim(); 
        }catch(IOException e){ }*/
        i=a.indexOf("");
        b=a.substring(0,i);
        try{
            x=Float.parseFloat(b);
        }catch(Exception e){
            x=5;
        }    
        b=a.substring(i+1);
        y=Float.parseFloat(b.trim());
        k=x+y;
        l=x*y;
        System.out.println(k+""+l);
        
        
    }
}
