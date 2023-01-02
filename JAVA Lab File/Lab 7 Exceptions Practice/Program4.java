// Code by Bhavy Kharbanda
// SAP Id: 500082531

public class Program4 {
    public static void main (String args[]){
        int a,b,c,d,e;
        a=25; b=4; c=0; d=3;
        try{
            e=a/b;
            System.out.println(e);
            e=a/c;
            System.out.println(e);
            e=a/d;
            System.out.println(e);
        }
        finally{
            System.out.println("Continue");
            e=a/d;
            System.out.println(e);
        }
    }    
}
