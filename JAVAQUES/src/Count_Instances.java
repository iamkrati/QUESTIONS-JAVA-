public class Count_Instances {
    static int count;
    {
        count++;
    }
}
class Instance_Main{
    public static void main(String[] args) {
       // Count_Instances obj = new Count_Instances();
        for(int i=0;i<3;i++)
        {
            new Count_Instances();
        }
        System.out.println(Count_Instances.count);
    }
}
