package Hello;
public class UpesStudent 
{
    public String name;
    public String city;
    private double cgpa;
    public  void changeCGPA(double x){
        cgpa = x;
    }
    public void printCGPA()
    {
        System.out.println("CGPA:" +cgpa);
    }
}
