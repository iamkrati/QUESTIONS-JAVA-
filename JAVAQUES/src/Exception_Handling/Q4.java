package Exception_Handling;

import java.util.Scanner;

class InvalidCountryException extends Exception{
    InvalidCountryException(String s){
     super(s);
    }
}
public class Q4 {

    public void registeruser(String name, String usercountry) {
    //    this.name = name;
      //  this.usercountry = usercountry;
        try {
            if (usercountry.equals("india"))
                System.out.println("user registration done successfully");
            else
                throw new InvalidCountryException("User outside India cannot be registerd");
        } catch (InvalidCountryException e) {
           System.out.println(e);
        }
      //  if(usercountry.equals("india"))

    }
    public static void main(String[] args) throws InvalidCountryException {
        Scanner sc = new Scanner(System.in);
        String name;
        String usercountry;
        name = sc.nextLine();
        usercountry = sc.nextLine();
        Q4 obj=new Q4();
        obj.registeruser(name,usercountry);
    }
}
