class Add{
    ///public Add(){}
    public int sum(int x){
        return x+4;
    }
    public void sum(int x,int y){
        System.out.println("Sum:"+(x+y));
    }
    public void sum(double x,double y,int z){
        System.out.println("Sum:"+(x+y+z));
    }
    public void sum(double x){
        System.out.println("Sum:"+(x+2.5));
    }
}

public class P6_DemoOverloading {
public static void main(String[] args) {
    Add A=new Add();
    System.out.println("Sum:"+A.sum(10));
    A.sum(10,23);
    A.sum(4.5,5,3);
    A.sum(3.53);
}
    
}