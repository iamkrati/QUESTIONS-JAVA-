package Exception_Handling;

//import java.util.Scanner;
public class MathOperation {
    public static void main(String[] args) {
        int arr[] = new int[args.length];
        try {
            int sum = 0;
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
                sum = sum + arr[i];
            }
            System.out.println("sum=" + sum + " avg.=" + (float)sum/arr.length);
        }

        catch(ArithmeticException | NumberFormatException exp)
        {
            System.out.println(exp.getClass().getName());
        }
    }
}
