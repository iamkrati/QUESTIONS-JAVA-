package Multithreading;

public class Q1 {
    public static void main(String[] args) {

      MyThread1 obj=new MyThread1();
      MyThread2 obj1=new MyThread2();
      obj.start();
      obj1.start();
      obj.setName("Scooby");
      System.out.println(obj.getName());
      obj1.setName("Shaggy");
      System.out.println(obj1.getName());
    }
}
class MyThread1 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread1");
        }
    }
   //Thread ob=Thread.currentThread();
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread2");
        }
    }
}
