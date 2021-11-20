import java.util.Scanner;


public class Programming {
    Programming() {
        System.out.println("I love programming languages");
    }

    Programming(String text) {
        System.out.println("I love " + text);
    }

}
class ProgrammingMain {
        ProgrammingMain() {
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("If you don't pass(Press1) otherwise enter any number");
            int c = sc.nextInt();
            if (c == 1) {
                new Programming();
            } else {
                System.out.println("enter text to attach");
                new Programming(sc.next());
            }

        }
    }