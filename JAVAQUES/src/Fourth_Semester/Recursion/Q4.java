package Fourth_Semester.Recursion;

import java.util.Scanner;

public class Q4 {
    ///static int sum=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(sum(arr,n));
    }
    public static int sum(int[] arr,int n){
        if(n<=0){
            return 0;
        }
        else{
            return
                    arr[n-1]+sum(arr,n-1);
        }
    }
}
