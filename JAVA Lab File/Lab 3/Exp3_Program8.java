//8. Implement a=a*b as a.mul(b), where a and b are objects of class Comp.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.*;

// Given class Comp
class Comp0 {
    float real, img;

    // Added parameterized ctor
    public Comp0(float a, float b) {
        this.real = a;
        this.img = b;
    }

    // Added default ctor to avoid errors
    public Comp0() {}

    public void getComp(float a, float b) {
        real = a;
        img = b;
    }

    public void print1() {
        System.out.println(real + " + " + img + "i");
    }

    public void duble() {
        real = 2 * real;
        img = 2 * img;
    }

    public void ktimes(int k) {
        real = k * real;
        img = k * img;
    }

    private float magsq() {
        return real * real + img * img;
    }

    public float magnitude() {
        float t;
        t = (float) Math.sqrt(this.magsq());
        return (t);
    }

    public void add(Comp0 x) {
        real = real + x.real;
        img = img + x.img;
    }

    public void add(Comp0 x, Comp0 y) {
        real = x.real + y.real;
        img = x.img + y.img;
    }

    public Comp0 add3(Comp0 x) {
        Comp0 c;
        float a, b;
        c = new Comp0();
        a = real + x.real;
        b = img + x.img;
        c.getComp(a, b);
        return (c);
    }

    public float getreal() {
        return (real);
    }

    public float getimaginary() {
        return (img);
    }

    // Added mul to take an object of class Comp as an argument
    // Functionality: a = a * b
    public void mul(Comp0 b) {
        // To prevent the change in value of real to reflect in img
        float originalReal = this.real;
        float originalImg = this.img;

        originalReal = (this.real * b.real) - (this.img * b.img);
        originalImg = (this.real * b.img) + (this.img * b.real);

        this.real = originalReal;
        this.img = originalImg;
    }
}

public class Exp3_Program8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Real and Img of first number: ");
        int r1 = input.nextInt();
        int i1 = input.nextInt();
        
        System.out.println("Input Real and Img of second number: ");
        int r2 = input.nextInt();
        int i2 = input.nextInt();

        Comp0 a = new Comp0(r1, i1);
        Comp0 b = new Comp0(r2, i2);

        System.out.println("Original complex numbers are: ");
        a.print1();
        b.print1();

        a.mul(b);

        System.out.println("The product of complex numbers is: ");
        a.print1();

        input.close();
    }
}