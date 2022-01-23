package Fourth_Semester.Recursion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int x,n;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        n=sc.nextInt();
        System.out.println(power(x,n));
    }
    static int power(int x,int n){
        if(n==0){
            return 1;
        }
        else{
            return x*power(x,n-1);
        }
    }
}
