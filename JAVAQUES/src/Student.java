import java.util.Scanner;

public class Student {
    String name;
    int age;
    String address;
    Student(){
        name="unknown";
        age=0;
        address="not available";
    }
    public void setInfo(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setInfo(String name,int age,String address)
    {
        this.name=name;
        this.address=address;
        this.age=age;
    }
    public void print(){
        System.out.println("name= "+name+" age= "+age+" address "+address);
    }
}
class StudentMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student arr[]=new Student[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=new Student();
        }
        for(int j=0;j<10;j++)
        {
        }
        System.out.println("enter name and age(for first 5 instances) || enter name,age and address (for rest)");
         arr[0].setInfo(sc.next(),sc.nextInt());
        arr[1].setInfo(sc.next(),sc.nextInt());
        arr[2].setInfo(sc.next(),sc.nextInt());
        arr[3].setInfo(sc.next(),sc.nextInt());
        arr[4].setInfo(sc.next(),sc.nextInt());
        arr[5].setInfo(sc.next(),sc.nextInt(), sc.next());
        arr[6].setInfo(sc.next(),sc.nextInt(), sc.next());
        arr[7].setInfo(sc.next(),sc.nextInt(), sc.next());
        arr[8].setInfo(sc.next(),sc.nextInt(),sc.next());
        arr[9].setInfo(sc.next(),sc.nextInt(),sc.next());
        for(int i=0;i<10;i++)
        {
            arr[i].print();
        }
    }
}
