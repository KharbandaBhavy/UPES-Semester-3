// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.Scanner;

class Student2 {
   String name, city;
   int age;

   public void getData(String x, String y, int t) {
      name = x;
      city = y;
      age = t;
   }

   public void printData() {
      System.out.println("Student name = " + name);
      System.out.println("Student city = " + city);
      System.out.println("Student age = " + age);
   }
}

class Exp2_Program2 {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      Student2 s1 = new Student2();
      Student2 s2 = new Student2();
      // Details for student 1
      
      System.out.println("Enter the name of student 1: ");
      s1.name = input.next();
      System.out.println("Enter the name of city of student 1: ");
      s1.city = input.next();
      System.out.println("Enter the age of student 1: ");
      s1.age = input.nextInt();
      s1.getData(s1.name, s1.city, s1.age);
      // Details for student 2
     
      System.out.println("Enter the name of student 2: ");
      s2.name = input.next();
      System.out.println("Enter the name of city of student 2: ");
      s2.city = input.next();
      System.out.println("Enter the age of student 2: ");
      s2.age = input.nextInt();
      s2.getData(s2.name, s2.city, s2.age);
      System.out.println("Details of Student 1");
      s1.printData();
      System.out.println("Details of Student 2");
      s2.printData();

      input.close();
   }
}
