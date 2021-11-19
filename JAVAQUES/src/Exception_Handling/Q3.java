package Exception_Handling;
import java.util.Scanner;
class UserDefinedException extends Exception
{
    UserDefinedException(String s)
    {
        super(s);
    }
}
public class Q3 {
    Scanner sc=new Scanner(System.in);
    String name;
    int[] marks;
    int sum;
    Q3() throws UserDefinedException,NumberFormatException
    {
        sum=0;
        System.out.println("Enter name of student");
        name=sc.nextLine();
        marks=new int[3];
        System.out.println("Enter marks of "+name);
        for (int i = 0; i < 3; i++) {
            marks[i] = Integer.parseInt(sc.next());
            if (marks[i] < 0) {
                throw new UserDefinedException("Marks cannot be Negative");
            }
            else if (marks[i] > 100) {
                throw new UserDefinedException("Marks cannot be more than 100");
            }
            sum = sum + marks[i];
        }
    }
    public static void main(String[] args)  {
        try {
            Q3 stu1=new Q3();
            System.out.println("Average marks of "+stu1.name+" = "+stu1.sum/3.0);
            Q3 stu2=new Q3();
            System.out.println("Average marks of "+stu2.name+" = "+stu2.sum/3.0);
        }
        catch (UserDefinedException|NumberFormatException e)
        {
            System.out.println(e);
        }
      //  System.out.println("vbnm");
    }
}