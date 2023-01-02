// 3. Write a program to launch 10 threads. Each thread increments a counter variable. Run the program with synchronization. 
// Code by Bhavy Kharbanda
// SAP ID: 500082531

class Launch implements Runnable {
    int a = 1;

    public synchronized void run() {
        System.out.println(a++);
    }

}

public class Exp9_Program3 {
    public static void main(String[] args) {
        Launch L = new Launch();
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(L);
            threads[i].start();
        }
    }
}
