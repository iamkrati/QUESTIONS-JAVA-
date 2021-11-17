public class PiggieBank {
    public static void main(String[] args) {
        AddAmount obj1=new AddAmount();
        AddAmount obj=new AddAmount(50);

    }
}
class AddAmount{
    int amount=50;
    AddAmount(){
        System.out.println("No money added to the PiggieBank so amount is : "+amount);
    }
    AddAmount(int addamount)
    {
        amount=amount+addamount;
        System.out.println("Final amount in piggie bank is : "+amount);
    }
}

