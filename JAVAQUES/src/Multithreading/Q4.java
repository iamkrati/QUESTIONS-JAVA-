package Multithreading;

public class Q4 {
    public static void main(String[] args) {
         CreateThread obj= new CreateThread();
         obj.start();
    }
}
class CreateThread extends Thread{
    @Override
    public void run() {
        int i;
        for(i=1;i<=5;i++)
        {
            System.out.println(i);
        }
        try{
            if(i==6)
                Thread.sleep(5000);
        }
        catch (InterruptedException exc)
        {
            System.out.println(i);
        }
        for(int j=i;j<=10;j++)
            System.out.println(j);
    }
}
