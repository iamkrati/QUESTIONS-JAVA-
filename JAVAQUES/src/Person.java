public class Person {
    String name;
    Person(String name)
    {
        this.name=name;
    }
}
class Student11 extends Person
{
    String CollegeName;
    public Student11(String name, String collegename) {
        super(name);
        CollegeName = collegename;
    }
}
class Teacher extends Person
{
    int salary;
    String subject;
    public Teacher(String name,int salary, String subject) {
        super(name);
        this.salary = salary;
        this.subject = subject;
    }
    void display()
    {
        System.out.println(name+" "+salary+" "+subject);
    }
}
class CollegeStudent extends Student11
{
    int year;
    String major;
    String collegename;
    public CollegeStudent(String name, String collegename, int year, String major) {
        super(name,collegename);
        this.collegename=collegename;
        this.year = year;
        this.major = major;
    }
    void display()
    {
        System.out.println(name+" "+collegename+" "+year+" "+major);
    }
}
class Test2
{
    public static void main(String[] args) {
        CollegeStudent obj1=new CollegeStudent("KRATI","GLA",1,"CS");
        Teacher obj2=new Teacher("Neeraj",150000,"OOPS");
        obj1.display();
        obj2.display();
    }
}