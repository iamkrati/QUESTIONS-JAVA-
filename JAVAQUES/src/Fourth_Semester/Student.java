package Fourth_Semester;
import java.util.Scanner;

public class Student {
    private int rollno;
    private int marks;
    private String name;
    //    public void set(int rollno){
//        this.rollno=rollno;
//    }
//    public int get(){
//        return  rollno;
//    }
    Student(int rollno,int marks,String name){
        this.rollno=rollno;
        this.marks=marks;
        this.name=name;
    }
    public static void marks(Student arr[]){
        int max=0,min=Integer.MAX_VALUE;
        int hstum=0;
        int lstum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].marks>max){
                max=arr[i].marks;
                hstum=i;
            }
            if(arr[i].marks<min){
                min=arr[i].marks;
                lstum=i;
            }
        }
        System.out.println("Details of highest marks student");
        System.out.println(arr[hstum].name+" "+arr[hstum].rollno+" "+arr[hstum].marks);
        System.out.println("Details of lowest marks student");
        System.out.println(arr[lstum].name+" "+arr[lstum].rollno+" "+arr[lstum].marks);
    }
    public static void main(String[] args) {
        Student arr[]=new Student[4];
        for(int i=0;i< arr.length;i++){
            Scanner sc=new Scanner(System.in);
            arr[i]=new Student(sc.nextInt(),sc.nextInt(),sc.next());
        }
        marks(arr);
    }
}

