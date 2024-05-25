package singleton_design_pattern;

public class Demo extends Thread {
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
    }

    public static void main(String[] args) throws InterruptedException {
        // Create multiple threads
        Thread t1 = new Demo();
        Thread t2 = new Demo();
        Thread t3 = new Demo();
        Thread t4 = new Demo();

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Wait for all threads to finish
        t1.join();
        t2.join();
        t3.join();
        t4.join();
    }
}
