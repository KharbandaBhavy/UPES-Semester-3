// 4. Write a Java program to create five threads with different priorities. 
// Send two threads of the highest priority to sleep state. Check the aliveness of the threads and mark which thread is long lasting.
// Code by Bhavy Kharbanda
// SAP ID: 500082531

public class Exp9_Program4 {
    public static void main(String args[]) throws InterruptedException {
        Thread T1 = new Thread();
        Thread T2 = new Thread();
        Thread T3 = new Thread();
        Thread T4 = new Thread();
        Thread T5 = new Thread();
        T1.setPriority(9);
        T2.setPriority(2);
        T3.setPriority(10);
        T4.setPriority(5);
        T5.setPriority(8);
        Thread.sleep(1000);
        if (T1.isAlive())
            System.out.println("Thread 1 is alive");
        else
            System.out.println("Thread 1 is not alive");
        T2.start();
        if (T2.isAlive())
            System.out.println("Thread 2 is alive");
        else
            System.out.println("Thread 2 is not alive");
        Thread.sleep(1000);
        if (T3.isAlive())
            System.out.println("Thread 3 is alive");
        else
            System.out.println("Thread 3 is not alive");
        T4.start();
        if (T4.isAlive())
            System.out.println("Thread 4 is alive");
        else
            System.out.println("Thread 4 is not alive");
        T5.start();
        if (T5.isAlive())
            System.out.println("Thread 5 is alive");
        else
            System.out.println("Thread 5 is not alive");
    }
}
