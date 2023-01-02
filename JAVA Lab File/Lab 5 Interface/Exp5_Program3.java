// 3. Write a program in Java to show the usefulness of Interfaces as a place to keep constant value of the program
// Code by Bhavy Kharbanda
// Sap Id: 500082531

interface Area 
{
    double pi = 3.14;   //This is the constant value.
    double compute(double radius);
}

class Circle implements Area {
    public double compute(double radius) {
        return (pi * radius * radius);
    }
}

class Exp5_Program3 {
    public static void main(String args[]) {
        Circle obj = new Circle();
        System.out.println("Area of the circle is: " + obj.compute(10)+ " unit square");
    }
}


