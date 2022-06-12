import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value_1");
        double x = in.nextDouble();
        System.out.println("Enter operation");
        String operation = in.next();
        System.out.println("Enter value_2");
        double y = in.nextDouble();
        double res;
        switch (operation) {
            case "+":
                res = x + y;
                System.out.printf("Result = %.4f", res);
                break;
            case "*":
                res = x - y;
                System.out.printf("Result = %.4f", res);
                break;
            case "-":
                res = x * y;
                System.out.printf("Result = %.4f", res);
                break;
            case "/":
                res = x / y;
                System.out.printf("Result = %.4f", res);
                break;
        }
    }
}
