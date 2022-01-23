package Fourth_Semester.Recursion;

import java.util.Scanner;

public class Q2 {
    public int i=1;
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Q2 obj=new Q2();
        obj.numbers(n);
    }
    void numbers(int n){
        if(i-1==n){
           // System.out.println(i);
            return;
        }
        else{
            System.out.print(i+" ");
            i++;
            numbers(n);
        }
    }
}
