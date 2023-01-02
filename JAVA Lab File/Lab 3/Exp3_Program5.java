// 5.Write a set of overloaded functionsmin() that returns the smaller of two numbers passed to them as arguments. 
// Make versions for int and float.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

public class Exp3_Program5 
{
    public int min(int x,int y){
        int result;
        result=x<y?x:y;
        return result;
    }
    public float min(float x,float y){
        float result;
        result=x<y?x:y;
        return result;
    }
    public static void main(String[] args) 
    {
        Exp3_Program5 num =new Exp3_Program5();
        int a=num.min(15,16);
        float b=num.min(23.40f,23.45f);
        
        System.out.printf(" The smaller number of the two integer is: %d",a);
        System.out.printf("\n The smaller number of the two float is: %.2f",b);
    }  
}
