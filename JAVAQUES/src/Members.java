import java.util.Scanner;

public class Members {
    String name,address;
    int age;
    long phone_number;
    float salary;

    public Members(String name,int age,long phone_number,String address,float salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone_number = phone_number;
        this.salary = salary;
    }
    public void display(){
        System.out.print("Name="+name+" Age="+age+" Phone_Number="+phone_number+" Address="+address+" ");
    }
    public void printsalary(){
        System.out.println("Salary="+salary);
    }
}
class Employee extends Members{
    String Department;
    public Employee(String name, int age, long phone_number, String address, float salary,String Department) {
        super(name, age, phone_number, address, salary);
        this.Department=Department;
    }
    @Override
    public void display() {
        super.display();
        // String Department;
        System.out.println("Department="+Department);
    }
}
class Manager extends Members{
    String Department;

    public Manager(String name, int age, long phone_number, String address, float salary,String Department) {
        super(name, age, phone_number, address, salary);
        this.Department=Department;
    }

    @Override
    public void display() {
        super.display();
        //String Department;
        System.out.println("Department="+Department);
    }
}
class Details{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name,age,phonenumber,address,salary,department of employee");
        Employee obj=new Employee(sc.nextLine(),Integer.parseInt(sc.nextLine()),Long.parseLong(sc.nextLine()),sc.nextLine(),Float.parseFloat(sc.nextLine()),sc.nextLine());
        System.out.println("Enter name, age ,phone number,address, salary and department of manager");
        Manager obj2=new Manager(sc.nextLine(),Integer.parseInt(sc.nextLine()),Long.parseLong(sc.nextLine()),sc.nextLine(),Float.parseFloat(sc.nextLine()),sc.nextLine());
        obj.display();
        obj2.display();
    }
}
