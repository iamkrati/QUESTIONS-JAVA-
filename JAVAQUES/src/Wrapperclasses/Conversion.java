package Wrapperclasses;

public class Conversion {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(Integer.parseInt(args[0])));
        System.out.println(Integer.toOctalString(Integer.parseInt(args[0])));
        System.out.println(Integer.toHexString(Integer.parseInt(args[0])));
    }
}
