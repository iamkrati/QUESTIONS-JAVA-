package Fourth_Semester;

import java.util.Scanner;

public class Company {
    int products[]=new int[3];
    int in=1;
    Company(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i< products.length;i++){
            products[i]=sc.nextInt();
        }
    }
   public static void view(Company[] arr){
       for(int i=0;i< arr.length;i++){
           System.out.println("Total Sales By Salesman "+(i+1)+":"+(arr[i].products[0]+arr[i].products[1]+arr[i].products[2]));
       }
   }
    public static void main(String[] args) {
        Company arr[]=new Company[5];
        for(int i=0;i< arr.length;i++){
            System.out.println("Enter the sales of 3 items sold by salesman "+(i+1));
            arr[i]=new Company();
        }
        view(arr);
    }
}
