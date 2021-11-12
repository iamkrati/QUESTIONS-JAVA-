import java.util.Scanner;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment arr[]=new Compartment[10];
        for( int i=0;i< arr.length;i++) {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 to 4");
            n = sc.nextInt();
            switch(n) {
                case 1:
                    arr[i] = new FirstClass();
                   break;
                case 2:
                    arr[i] = new Luggage();
                    break;
                case 3:
                    arr[i] = new Ladies();
                    break;
                case 4:
                    arr[i] = new General();
                    break;
               default:
                    System.out.println("wrong value entered");
            }
        }
            for(int i=0;i<10;i++)
            {
                System.out.println(arr[i].notice());
            }
        }
    }

