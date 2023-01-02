class Student{
    public String name;
    String city;
    public double cgpa;
    public static int stuCount=0;
    public void printName(){
        stuCount++;
        System.out.println("Total no of Students: "+stuCount);
        //System.out.println("Name of the Student: "+name);
    }
    public void changeName(String x){
        name=x;
    }

}
class P3_DemoStudent{
    public static void main(String[] args) {
        Student Amit =new Student();
        Amit.name="Amit Kumar";
        Amit.city="Kanpur";
        Amit.cgpa=7.79;
        Amit.printName();
        System.out.println("Name of the student:"+Amit.name);
        System.out.println("City of the student:"+ Amit.city);
        System.out.println("CGPA of the student: "+ Amit.cgpa);


        Student Sumit =new Student();
     
        Sumit.changeName("Sumit Aanand");
        Sumit.city="Varanasi";
        Sumit.cgpa=5.37;
        Sumit.printName();
        System.out.println("Name of the student:"+Sumit.name);
        System.out.println("City of the student:"+ Sumit.city);
        System.out.println("CGPA of the student: "+ Sumit.cgpa);


        Student Ayush =new Student();
        Ayush.changeName("Ayush Sharma");
        Ayush.printName();
        System.out.println("Name of the student:"+Ayush.name);
        System.out.println("Class strength:"+Student.stuCount);
        
    }
}

