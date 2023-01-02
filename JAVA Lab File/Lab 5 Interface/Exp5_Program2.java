// 2.Write a program to create interface A, in this interface we have two method meth1 and meth2. 
// Implements this interface in another class named MyClass.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

interface A {
    public void meth1();

    public void meth2();
}

class MyClass implements A {
    public void meth1() {
        System.out.println("Hello Everyone!");
    }

    public void meth2() {
        System.out.println("I am Bhavy");
    }
}

public class Exp5_Program2 {
    public static void main(String[] args) {
        A obj = new MyClass();
        obj.meth1();
        obj.meth2();
    }
}
