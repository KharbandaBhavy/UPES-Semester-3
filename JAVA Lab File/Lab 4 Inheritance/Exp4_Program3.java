//3.Write a class Worker and derive classes DailyWorker and SalariedWorker from it. Every worker has a name and a salary rate. 
// Write method ComPay (int hours) to compute the week pay of every worker. 
// A Daily Worker is paid on the basis of the number of days he/she works. The Salaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are.
// Test this program to calculate the pay of workers. You are expected to use the concept of polymorphism to write this program.

// Code by Bhavy Kharbanda
// Sap Id: 500082531

class Worker {
    String name;
    int id;

    Worker(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println(" Worker Name: " + name);
        System.out.println(" Worker ID: " + id);
    }
}

class DailyWorker extends Worker {
    int rate;

    DailyWorker(String n, int i, int r) {
        super(n, i);
        rate = r;
    }
// d is the number of days for which they have worked, so they are paid accordingly.
    void compay(int d) {
        display();
        System.out.println(" Salary: " + rate * d);
    }
}

class SalariedWorker extends Worker {
    int rate;

    SalariedWorker(String n, int i, int r) {
        super(n, i);
        rate = r;
    }

    int h = 40;
    //They are paid for 40 hours only with respect to the rate.
    void compay() {
        display();
        System.out.println(" Salary: " + rate * h);
    }
}

class Exp4_Program3 
{
    public static void main(String args[]) {
        DailyWorker d = new DailyWorker("Vaibhav", 1, 100);
        SalariedWorker s = new SalariedWorker("Shantanu", 2, 200);
        System.out.println("****Daily Worker****");
        d.compay(30);
        //30 is the number of days
        System.out.println("****Salaried Worker****");
        s.compay();
    }
}
