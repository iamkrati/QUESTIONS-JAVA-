package Multithreading;

public class Q5 {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
               // t1.setPriority(10);
                System.out.println("max");
            }
        };
        t1.setPriority(10);
        Thread t2=new Thread(){
            public void run(){
                System.out.println("minn");
            }
        };
        t2.setPriority(1);
        Thread t3=new Thread(){
            public void run(){
                // t1.setPriority(10);
                System.out.println("normal");
            }
        };
        t3.setPriority(5);
        t1.start();
        t2.start();
        t3.start();
    }
}
