
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.Scanner;

class Point 
{ 
    float x;
    float y;
    public void getPoint(float a,float b)
    {
        x=a;
        y=b;
    }

    public void print() 
    {
        System.out.println("("+x+","+y+")");
    }

    public void abc() 
    {
        x=2*x;
        y=3*y;
    }
    public Point pqr(Point P) 
    {   
        Point t;
        t=new Point();
        t.getPoint(2*P.x,2*P.y);
        return t;
    }

    public void ghi(Point P) 
    {
        P.x=2*P.x;
        P.y=3*P.y;
    }

    public float getx()
    {   
        return x;
    }

    //Function Declaration
    public Point fa(Point P) 
    {   
        Point t;
        t=new Point();
        t.getPoint(P.x+P.y,2*P.y);
        return t;
    }
    
}

class Exp2_Program3
{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        Point P = new Point();
        System.out.println("Enter the value of first point:");
        P.x = input.nextFloat();
        System.out.println("Enter the value of second point:");
        P.y = input.nextFloat();

        P.getPoint(P.x,P.y);
        //Original Values
        P.print();
        P.fa(P);
        P.print();  
        input.close();
    }

}




