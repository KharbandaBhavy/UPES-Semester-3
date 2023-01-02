// 1. Write a program in Java to display the names and roll numbers of students. Initialize respective array variables for 10 students. 
// Handle ArrayIndexOutOfBoundsExeption, so that any such problem doesn’t cause illegal termination of program. 
// Code by Bhavy Kharbanda
// Sap Id: 500082531

class Student{
    int roll;
    String name;

    public Student(String name, int roll){
        this.roll = roll;
        this.name = name;
    }

    public void print()
    {
        System.out.printf("Roll NO. : %d\t Name : %s\n", roll, name);

    }
}
public class Exp7_Program1 {
    public static void main(String[] args) {
        Student[] Arr = new Student[10];
        try{
            Arr[0] = new Student("Nick", 1);
            Arr[1] = new Student("John", 2);
            Arr[2] = new Student("Jerry", 3);
            Arr[3] = new Student("Tom", 4);
            Arr[4] = new Student("Spike", 5);
            Arr[5] = new Student("Tyler", 6);
            Arr[6] = new Student("Chris", 7);
            Arr[7] = new Student("Issac", 8);
            Arr[8] = new Student("Rick", 9);
            Arr[9] = new Student("Joey", 10);
            // 11th Student will cause Exception
            Arr[10] = new Student("Kayo", 11);
        }catch(Exception e){
            System.out.println(e);
            System.out.println("");
        }
        for (int i = 0;i<Arr.length;i++){
            Arr[i].print();
        }
    }
}

