package Fourth_Semester;

public class Duplicacy {
    public static void main(String[] args) {
        int arr[]={4,5,4,6,8,9,5,4,9,9};
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j] && arr[i]!=-1){
                    System.out.println(arr[i]+": duplicate element found at location "+(j+1));
                    arr[j]=-1;
                }
            }
        }
    }
}
