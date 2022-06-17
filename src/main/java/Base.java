import java.util.Scanner;

/**
 * @author Alex Fedenev
 * @see #simpleCalculator(String, double, double) Вычисление не сложных математических операций
 * @see #main(String[]) Основной метод спользуется для операций ввода-вывода
 */
public class Base {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double x = in.nextDouble();
        System.out.println("Операцию:");
        String operation = in.next();
        System.out.println("Введите второе число:");
        double y = in.nextDouble();
        double result = simpleCalculator(operation, x, y);
        System.out.printf("Результат операции = %.4f", result);
        in.close();
    }

    /**
     * @param operation В параметр передаем математическую операцию
     * @param x         Первое значение
     * @param y         Второе значение
     * @return Результат вычисления
     */
    public static double simpleCalculator(String operation, double x, double y) {
        double res = 0;
        switch (operation) {
            case "+":
                res = x + y;
                break;
            case "-":
                res = x - y;
                break;
            case "*":
                res = x * y;
                break;
            case "/":
                res = x / y;
                break;
            default:
                System.err.println("Введите корректную операцию, возможны следующие: '*','-','+','/'");
        }
        return res;
    }
}