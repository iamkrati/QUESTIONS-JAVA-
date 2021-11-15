import java.util.Scanner;

public class Studen1 {
    String name;
    float percentage;
    Studen1(String name,float percentage){
        this.name=name;
        this.percentage=percentage;
    }

}
class Stu1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Studen1 arr[]=new Studen1[3];
        for(int i=0;i< arr.length;i++)
        {
            System.out.println("enter name and percentage");
            arr[i]=new Studen1(sc.next(), sc.nextFloat());
        }
//        Test obj1=new Test(sc.next(),sc.nextFloat());
//        System.out.println("enter name and percentage");
//        Test obj2=new Test(sc.next(),sc.nextFloat());
//        System.out.println("enter name and percentage");
//        Test obj3=new Test(sc.next(),sc.nextFloat());
        if(arr[0].percentage>arr[1].percentage)
        {
            if(arr[0].percentage>arr[2].percentage){
                System.out.println("Name="+arr[0].name+" Topper_Percentage="+arr[0].percentage);
            }
            else{
                System.out.println("Name="+arr[2].name+" Topper_Percentage="+arr[2].percentage);
            }
        }
        else
        {
            if(arr[1].percentage<arr[2].percentage){
                System.out.println("Name="+arr[2].name+" Topper_Percentage="+arr[2].percentage);
            }
            else
                System.out.println("Name="+arr[1].name+" Topper_Percentage="+arr[1].percentage);
        }
    }
}
