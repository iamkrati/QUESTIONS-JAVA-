import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50};
        System.out.println("Enter search element");
        int ele=sc.nextInt();
         Array obj=new Array();
        System.out.println(obj.search(arr,ele));
    }
}
class Array{
    public boolean search(int arr[], int ele){
        for(int i=0;i<5;i++)
        {
            if(arr[i]==ele)
            {
                return true;
            }
        }
        return false;
    }
}
