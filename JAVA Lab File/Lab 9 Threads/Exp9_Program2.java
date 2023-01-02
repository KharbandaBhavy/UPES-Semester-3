// 2. Write a program for generating 2 threads, one for printing even numbers and the other for printing odd numbers.
// Code by Bhavy Kharbanda
// SAP ID: 500082531

class Even implements Runnable {
    public void run() {
        for (int i = 0; i <=20; i += 2) {
            System.out.println(i);
        }
    }
}

class Odd implements Runnable {
    public void run() {
        for (int i = 1; i <20; i += 2) {
            System.out.println(i);
        }
    }
}

public class Exp9_Program2 {
    public static void main(String[] args) {
        Runnable E = new Even();
        Thread T1 = new Thread(E);
        Runnable O = new Odd();
        Thread T2 = new Thread(O);
        T1.start();
        T2.start();
    }
}
