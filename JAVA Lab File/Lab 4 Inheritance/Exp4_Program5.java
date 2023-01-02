// 5.Design a class employee of an organization. An employee has a name, empid, and salary. Write the default constructor, a constructor with parameters (name, empid, and salary) and methods to return name and salary. 
// Also write a method increaseSalary that raises the employee’s salary by a certain user specified percentage. Derive a subclass Manager from employee. 
// Add an instance variable named department to the manager class. Supply a test program that uses theses classes and methods.   

// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.*;

class Employee {
    String name;
    int empid;
    float salary;

    Employee() {} //Default Constructor

    Employee(String n, int e, float s) //Parameterized Constructor
    {
        name = n;
        empid = e;
        salary = s;
    }

    void printdetails()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Salary: " + salary);
    }

    float increaseSalary() {
        System.out.println("Enter the percentage by which you want to increase the salary: ");
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        input.close();
        float increase = salary + (p * salary) / 100;
        return increase;
        
    }
}

class Manager extends Employee 
{
    void dep(String department) {
        System.out.println(name + " belong to the " + department + " department ");
    }
}

public class Exp4_Program5 {
    public static void main(String[] args) {
        Employee e = new Employee("Bhavy", 251, 10000);
        Manager m = new Manager();
        e.printdetails();
        System.out.println("The new salary is: " +e.increaseSalary());
        m.dep("HR");
        
    }
}

