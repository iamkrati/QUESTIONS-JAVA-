package Multithreading;

import java.util.Random;

public class Q2 implements Runnable {

    public static void main(String[] args) {
        Q2 OBJ = new Q2();
        Thread t1 = new Thread(OBJ);
        t1.start();
    }
    @Override
    public void run() {
        Random random = new Random();
        String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
        int index;
        while ((index=random.nextInt(6)) != 4) {
            System.out.println(colours[index]);
        }
    }
}
