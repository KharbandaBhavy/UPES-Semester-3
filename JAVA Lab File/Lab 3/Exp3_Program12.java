// 12.Implement a=b/c as a=Comp.divide(b, c), where a, b and c are objects of class Comp.
// Hint: a/b is defined as a*b.conjugate()/b.magnitude2()]
// Code by Bhavy Kharbanda
// Sap Id: 500082531

// Given class Comp
class Comp4 {
    float real, img;

    // Added parameterized ctor
    public Comp4(float a, float b) {
        this.real = a;
        this.img = b;
    }

    // Added default ctor to avoid errors
    public Comp4() {}

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

    public void add(Comp4 x) {
        real = real + x.real;
        img = img + x.img;
    }

    public void add(Comp4 x, Comp4 y) {
        real = x.real + y.real;
        img = x.img + y.img;
    }

    public Comp4 add3(Comp4 x) {
        Comp4 c;
        float a, b;
        c = new Comp4();
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

    public static Comp4 mul(Comp4 b, Comp4 c) {
        // To prevent the change in value of real to reflect in img
        Comp4 returnComp = new Comp4();

        float returnReal = (b.real * c.real) - (b.img * c.img);
        float returnImg = (b.real * c.img) + (b.img * c.real);

        returnComp.real = returnReal;
        returnComp.img = returnImg;

        return returnComp;
    }

    public static Comp4 divideObjs(Comp4 b, Comp4 c) {
        Comp4 resultObject = new Comp4();

        Comp4 numerator = new Comp4();
        c.img *= -1;
        numerator = mul(b, c);

        // double bMag = this.magnitude();
        float denominator = c.magnitude() * c.magnitude();

        resultObject.real = numerator.real / denominator;
        resultObject.img = numerator.img / denominator;

        return resultObject;
    }
}

public class Exp3_Program12 {
    public static void main(String[] args) {
        Comp4 a = new Comp4();

        // Known test case
        Comp4 b = new Comp4(2, -7);
        Comp4 c = new Comp4(4, 3);

        // Known output is (-0.52, -1.36)
        a = Comp4.divideObjs(b, c);

        a.print1();
    }
}
