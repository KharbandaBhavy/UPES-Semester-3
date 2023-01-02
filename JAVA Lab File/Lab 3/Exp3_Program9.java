// 9.Implement a=b*c as a=Comp.mul(b, c), where a, b and c are objects of class Comp.
// Code by Bhavy Kharbanda
// Sap Id: 500082531
// Given class Comp

class Comp {
    float real, img;

    // Added parameterized ctor
    public Comp(float a, float b) {
        this.real = a;
        this.img = b;
    }

    // Added default ctor to avoid errors
    public Comp() {}

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

    public void add(Comp x) {
        real = real + x.real;
        img = img + x.img;
    }

    public void add(Comp x, Comp y) {
        real = x.real + y.real;
        img = x.img + y.img;
    }

    public Comp add3(Comp x) {
        Comp c;
        float a, b;
        c = new Comp();
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
    public static Comp mul(Comp b, Comp c) {
        Comp returnComp = new Comp();

        float returnReal = (b.real * c.real) - (b.img * c.img);
        float returnImg = (b.real * c.img) + (b.img * c.real);

        returnComp.real = returnReal;
        returnComp.img = returnImg;

        return returnComp;
    }
}

public class Exp3_Program9 {
    public static void main(String[] args) 
    {
        Comp a = new Comp();
        Comp b = new Comp(3, -5);
        Comp c = new Comp(2, 4);
        System.out.println("Original complex numbers are: ");
        b.print1();
        c.print1();
        a = Comp.mul(b, c);
        a.print1();
    }
}