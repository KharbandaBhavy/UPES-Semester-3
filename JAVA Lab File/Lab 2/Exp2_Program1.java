// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.Scanner;
    class Student1   
    {

        String name, city;
        int age;
        static int m;
        void printData()
        {
	        System.out.println("Student name = "+name);
	        System.out.println("Student city = "+city);
	        System.out.println("Student age = "+age);
        }    
    }

    public class Exp2_Program1
    {
        public static void main(String[] args)
        {
            
            Scanner input = new Scanner(System.in);
            Student1 s1=new Student1();
            Student1 s2=new Student1();
            System.out.println("Enter the name of student 1: ");
            s1.name=input.next();
            System.out.println("Enter the name of city of student 1: ");
            s1.city=input.next();
            System.out.println("Enter the age of student 1: ");
            s1.age=input.nextInt();
            System.out.println("Enter the name of student 2: ");
            s2.name=input.next();
            System.out.println("Enter the name of city of student 2: ");
            s2.city=input.next();
            System.out.println("Enter the age of student 2: ");
            s2.age=input.nextInt();
            System.out.println("Details of student 1:");
            s1.printData();
            System.out.println("Details of student 2:");
            s2.printData(); 
            input.close();
            
        }  
    }


    