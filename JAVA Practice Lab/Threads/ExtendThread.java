class MyThread extends Thread {
    MyThread(){
        super("Demo Thread");
        System.out.println("Child Thread: " + this);
        start();
    }
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted ");
        }
        System.out.println("Exiting Child Thread");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        MyThread A = new MyThread();
        A.start();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main method Interrupted ");
        }
        System.out.println("Exiting Main Thread");
    }
}



