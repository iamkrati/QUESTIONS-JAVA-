import java.util.Scanner;

public class Customer_Purchases {
    private int customer_number;
   private String firstname,surname,product;
   private long price;
   private int quantity;
  //  private int cusomer_number;
    public void set_customer_number(int customer_number){
       this.customer_number=customer_number;
   }
   public int get_customer_number(){
        return customer_number;
   }
   public void set_firstname(String firstname){
        this.firstname=firstname;
   }
   public String get_firstname(){
        return firstname;
   }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
class Printing {
    Customer_Purchases obj=new Customer_Purchases();
    public void Print_Details(){
       System.out.print("customer_number="+obj.get_customer_number()+" first_name="+obj.get_firstname()+" surname="+obj.getSurname());
        System.out.println(" price="+obj.getPrice()+" product="+obj.getProduct()+" Quantity="+obj.getQuantity());
   }
    void customerPurchaseReport()
    {
        float total=obj.getQuantity()*obj.getPrice();
        float tax=total*(15.0f/100);
        float commission=total*(8.5f/100);
        float discount=total*(10.0f/100);
        total=total+tax-(discount+commission);
        System.out.println("Tax=15%= Rs."+tax);
        System.out.println("Commission=8.5%=Rs."+commission);
        System.out.println("Discount=10%=Rs."+discount);
        System.out.println("Total =Rs."+total);
    }
}
class CustomerPurchaseReport{
    public static void main(String[] args) {
        char ch;
        Scanner sc=new Scanner(System.in);
        do{
        Printing ob=new Printing();
        System.out.println("Enter number,first_name, surname,product,price,quantity");
        ob.obj.set_customer_number(sc.nextInt());
        ob.obj.set_firstname(sc.next());
        ob.obj.setSurname(sc.next());
        ob.obj.setProduct(sc.next());
        ob.obj.setPrice(sc.nextLong());
        ob.obj.setQuantity(sc.nextInt());
        ob.Print_Details();
        ob.customerPurchaseReport();
            System.out.println("if want to add or print more customer's information:Press Yory");
            ch=sc.next().charAt(0);
        }while(ch=='y' ||ch=='Y');

    }
}
