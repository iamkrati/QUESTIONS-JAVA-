package Fourth_Semester.Recursion;

import java.util.Scanner;

public class Q3 {
    static int i=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    public static void main(String[] args) {
        Q3 obj=new Q3();
        System.out.println(obj.digits());
    }
    public int digits(){
       if(n==0){
           return 0;
       }
       else
       {
           i++;
           n=n/10;
           digits();
       }
       return i;
    }
}
