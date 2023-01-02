// 4.Write a program to create an Interface having two methods division and modules. Create a class, which overrides these methods.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

interface A1
{
    public void division(int a);
    public void modules(int b);
}

class B implements A1 {
    int div, mod;

    public void division(int a) {
        div = a;
    }

    public void modules(int b) {
        mod = b;
    }

    void display() {
        System.out.println("Number of Division: " + div);
        System.out.println("Number of Modules: " + mod);
    }
}

class Exp5_Program4 {
    public static void main(String args[]) {
        B obj = new B();
        obj.division(10);
        obj.modules(5);
        obj.display();
    }
}
