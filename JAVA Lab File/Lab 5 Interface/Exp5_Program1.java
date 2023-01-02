// 1.Write a program to create interface named test. In this interface the member function is square. 
// Implement this interface in arithmetic class. Create one new class called ToTestInt. In this class use the object of arithmetic class.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.*;

interface Test 
{
    public void square();
}

class Arithmetic implements Test {
    public void square() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get it's square: ");
        int num = input.nextInt();
        System.out.println("The square of " + num + " is :" + num * num);
        input.close();
    }
}

public class Exp5_Program1           //This class is 'ToTestInt class'
{    

    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        obj.square();
    }
}

