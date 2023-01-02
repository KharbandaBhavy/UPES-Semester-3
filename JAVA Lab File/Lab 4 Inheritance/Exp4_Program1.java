// 1.Write a Java program to show that private member of a super class cannot be accessed from derived classes. 
// Code by Bhavy Kharbanda
// Sap Id: 500082531

class Parent {
    public void parentfunc() {  //If we change this to private the program will not run
        System.out.println("In Parent class");
    }

    public int n; //If we change this to private the program will not run
}

class Child extends Parent {
     public void func() {
         System.out.println("In child class");
    }
 }

public class Exp4_Program1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.parentfunc();
        obj.n = 10;
        System.out.println(obj.n);
    }
}


