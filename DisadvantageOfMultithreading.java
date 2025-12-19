package LearningJava;

class Demo implements Runnable {

    synchronized public void run() {

        String name = Thread.currentThread().getName();
        System.out.println(name + " printing started");

        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is printing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Some problem occurred");
            }
        }

        System.out.println(name + " completed");
    }
}

public class DisadvantageOfMultithreading {

    public static void main(String[] args) {

        Demo d = new Demo();

        Thread t1 = new Thread(d, "raj");
        Thread t2 = new Thread(d, "sekhar");

        t1.start();
        t2.start();
    }
}
