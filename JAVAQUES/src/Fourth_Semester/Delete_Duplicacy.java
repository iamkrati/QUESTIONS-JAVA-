package Fourth_Semester;

import java.util.ArrayList;

public class Delete_Duplicacy {
    public static void main(String[] args) {
        int arr[]={10 ,10,10, 10,30, 30, 40,10, 50,10, 50, 50, 9, 45};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
       System.out.println(list);
   //     System.out.println(list.size());
        for(int i=0;i<list.size()-1;i++) {
                if (list.get(i) == list.get(i+1)) {
                    list.remove(i+1);
                    i--;
         //           System.out.println(list.size());
                }
            }
        System.out.println(list);

    }
}
