package Multithreading;

public class Q3 extends Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }
        });
        t1.start();
        try {
            t1.join();

        } catch (Exception e) {

        }
        t2.start();
        try {
            t2.join();
        } catch (Exception ex) {

        }
    }
}
