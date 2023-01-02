// 1. Write a program to implement the concept of threading by extending Thread Class and Runnable interface.
// Code by Bhavy Kharbanda
// SAP ID: 500082531

class MyThread1 extends Thread {
    public void run() {
        System.out.println("Extended Thread Running");
    }
}

class MyThread2 implements Runnable {
    public void run() {
        System.out.println("Runnable Interface Thread Running");
    }
}

public class Exp9_Program1 {
    public static void main(String[] args) {

        Thread A = new MyThread1();
        A.start();                            // For Extended class Thread
        Runnable B = new MyThread2();
        Thread C = new Thread(B);
        C.start();                           // For Runnable Interface Thread
    }
}