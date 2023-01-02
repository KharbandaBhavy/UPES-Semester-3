// 11. Implement a=b/c as a=b.divide(c), where a, b and c are objects of class Comp.
// [Hint: a/b is defined as a*b.conjugate()/b.magnitude2()]
// Code by Bhavy Kharbanda
// Sap Id: 500082531

// Given class Comp
class Comp3 {
    float real, img;

    // Added parameterized ctor
    public Comp3(float a, float b) {
        this.real = a;
        this.img = b;
    }

    // Added default ctor to avoid errors
    public Comp3() {}

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
        return (real * real) + (img * img);
    }

    public float magnitude() {
        float t;
        t = (float) Math.sqrt(this.magsq());
        return (t);
    }

    public void add(Comp3 x) {
        real = real + x.real;
        img = img + x.img;
    }

    public void add(Comp3 x, Comp3 y) {
        real = x.real + y.real;
        img = x.img + y.img;
    }

    public Comp3 add3(Comp3 x) {
        Comp3 c;
        float a, b;
        c = new Comp3();
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

    public static Comp3 mul(Comp3 b, Comp3 c) {
        // To prevent the change in value of real to reflect in img
        Comp3 returnComp = new Comp3();

        float returnReal = (b.real * c.real) - (b.img * c.img);
        float returnImg = (b.real * c.img) + (b.img * c.real);

        returnComp.real = returnReal;
        returnComp.img = returnImg;

        return returnComp;
    }

    // public void Conjugate(Comp a) {
    //     a.img *= -1;
    // }

    public Comp3 divide(Comp3 c) {
        Comp3 resultObject = new Comp3();

        Comp3 numerator = new Comp3();
        c.img *= -1;
        numerator = mul(this, c);

        float denominator = c.magnitude() * c.magnitude();

        resultObject.real = numerator.real / denominator;
        resultObject.img = numerator.img / denominator;

        return resultObject;
    }
}

public class Exp3_Program11 {
    public static void main(String[] args) {
        Comp3 a = new Comp3();

        // Known test case
        Comp3 b = new Comp3(2, -7);
        Comp3 c = new Comp3(4, 3);

        // Known output is (-0.52, -1.36)
        a = b.divide(c);

        a.print1();
    }
}
