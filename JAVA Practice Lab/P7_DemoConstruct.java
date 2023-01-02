class Student2{
    private String name;
    private String city;
    private double cgpa;

    // Default Constructor
    public Student2()
    {
        name = "Amit Kumar";
        city = "Kanpur";
        cgpa = 7.7;
    }

    //Parameterized Constructor
    public Student2(String x, String y, double z)
    {
        name = x;
        city = y;
        cgpa = z;
    }
    /*public void getData(String x, String y, double z)
    {
        name = x;
        city = y;
        cgpa = z;

    }*/
    public void printData()
    {
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("Cgpa: "+cgpa);
    }

}



public class P7_DemoConstruct {
    public static void main(String[]args) {
        Student2 Amit = new Student2("Amit Kumar", "Kanpur", 7.7);
        //Amit.getData("Amit Kumar", "Kanpur", 7.7);
        Amit.printData();
        Student2 Sumit = new Student2("Sumit Sharma", "Varanasi",9.2);
        Sumit.printData();
        
        //Copy constructor
        Student2 SumitCopy = new Student2();
        SumitCopy = Sumit;
        SumitCopy.printData();

    }

}
