package Exception_Handling;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
      Array_Exception obj1=new Array_Exception();
    }
}
class Array_Exception {
    Scanner sc = new Scanner(System.in);
    int n, index;
    int arr[];

    Array_Exception() {
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        index = sc.nextInt();
        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException obj) {
            System.out.println(obj);//name and description
            System.out.println(obj.getClass().getName());//name
            System.out.println(obj.getMessage());//description
            System.out.println(obj.toString());//name and description
             obj.printStackTrace();//name,description and stacktrace
        }
        System.out.println("Exception Handling done");
    }
}


