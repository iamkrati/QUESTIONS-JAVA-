package Exception_Handling;


import java.util.Scanner;

class InvalidAgeEcxeption extends Exception{
    InvalidAgeEcxeption(String s)
    {
        super(s);
    }
}
public class Q5 {
    public static void main(String[] args) throws InvalidAgeEcxeption {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name and age");
        int age = Integer.parseInt(args[1]);
        try {
            if (age < 18 || age>60)
                throw new InvalidAgeEcxeption("age is less than 18 or greater than 6o");
        } catch (InvalidAgeEcxeption exp) {
            System.out.println(exp);
        }

    }
}
