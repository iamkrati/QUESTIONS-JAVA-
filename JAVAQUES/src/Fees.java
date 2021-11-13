import java.util.Scanner;

public class Fees {
    public static void main(String[] args) {
        TotalFees t_fees=new TotalFees();
        System.out.println(t_fees.totalfees());
    }
}
class TotalFees{
    int fees,deposit;
    int school_levy,sports_fees;
    Scanner sc=new Scanner(System.in);
    TotalFees(){
        System.out.println("enter fees greater than or equal to 50000 and fd greater than or equal to 10000");
        fees=sc.nextInt();
        deposit=sc.nextInt();
        school_levy = fees * 10 / 100;
        sports_fees = fees * 5 / 100;
    }
    public int totalfees(){
     if(deposit>=fees/2){
         fees=fees*95/100;
      }
      return fees+sports_fees+school_levy-deposit;
    }
}
