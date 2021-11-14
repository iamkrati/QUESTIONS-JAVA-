import java.util.Scanner;

public class Test {
    String name;
    float percentage;
    Test(String name,float percentage){
        this.name=name;
        this.percentage=percentage;
    }

}
class Stu{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name and percentage");
        Test obj1=new Test(sc.next(),sc.nextFloat());
        System.out.println("enter name and percentage");
        Test obj2=new Test(sc.next(),sc.nextFloat());
        System.out.println("enter name and percentage");
        Test obj3=new Test(sc.next(),sc.nextFloat());
        if(obj1.percentage>obj2.percentage)
        {
            if(obj1.percentage>obj3.percentage){
                System.out.println("Name="+obj1.name+" Topper_Percentage="+obj1.percentage);
            }
            else{
                System.out.println("Name="+obj3.name+" Topper_Percentage="+obj3.percentage);
            }
        }
        else
        {
            if(obj2.percentage<obj3.percentage){
                System.out.println("Name="+obj3.name+" Topper_Percentage="+obj3.percentage);
            }
            else
                System.out.println("Name="+obj2.name+" Topper_Percentage="+obj2.percentage);
        }
    }
}
