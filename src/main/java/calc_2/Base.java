package calc_2;

import java.util.Scanner;

public class Base {

    public static void main(String[] args) {
        String str = readingFromConsole();
        Calculator calculator = new Calculator(str);
        result(calculator);
    }

    public static String readingFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение, например '2+2':");
        String str = in.nextLine();
        in.close();
        return str;
    }

    public static void result(Calculator calculator) {
        try {
            System.out.println(calculator.getStringFromConsole() + "=" + calculator.getOutRes());
        } catch (MyArifmeticException mae) {
            System.out.println("Нельзя делить на ноль " + mae);
        } catch (NumberFormatException nfe) {
            System.out.println("Вы ввели не корректное выражение" + nfe);
        }
    }
}
