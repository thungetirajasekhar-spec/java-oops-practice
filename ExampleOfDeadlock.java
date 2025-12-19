package LearningJava;

class Family implements Runnable {

    Object tv = new Object();
    Object playStation = new Object();

    public void run() {
        String name = Thread.currentThread().getName();

        if (name.equals("CR")) {
            crAccuquiredResource();
        } else {
            mokshaAccuquiredResource();
        }
    }

    void crAccuquiredResource() {
        synchronized (tv) {
            System.out.println("CR acquired TV");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (playStation) {
                System.out.println("CR acquired PlayStation");
            }
        }
    }

    void mokshaAccuquiredResource() {
        synchronized (playStation) {
            System.out.println("moksha acquired PlayStation");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (tv) {
                System.out.println("moksha acquired TV");
            }
        }
    }
}

public class ExampleOfDeadlock {

    public static void main(String[] args) {

        Family f = new Family();

        Thread t1 = new Thread(f);
        Thread t2 = new Thread(f);

        t1.setName("CR");
        t2.setName("moksha");

        t1.start();
        t2.start();
    }
}
