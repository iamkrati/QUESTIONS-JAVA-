public class Calculator {
    public static int powerInt(int num1, int num2) {
        double data = Math.pow(num1, num2);
        Double datanew = new Double(data);
        int a = datanew.intValue();
        return a;
    }

    public static Double powerDouble(double num1, int num2) {
             return Math.pow(num1,num2);
    }
}

class CalculatorMain{
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        System.out.println(Calculator.powerInt(5,6));
        System.out.println(Calculator.powerDouble(4.6,6));
    }
}
