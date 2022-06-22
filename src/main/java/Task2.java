import java.util.Scanner;

/**
 * @author Alex Fedenev
 * @see #simpleCalculator(String, double, double) Вычисление не сложных математических операций
 * @see #main(String[]) Основной метод спользуется для операций ввода-вывода
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите задачу: (1-калькулятор, 2- массив строк)");
        int a = in.nextInt();
        if (a == 1) {
            System.out.println("Введите первое число:");
            double x = in.nextDouble();
            System.out.println("Операцию:");
            String operation = in.next();
            System.out.println("Введите второе число:");
            double y = in.nextDouble();
            double result = simpleCalculator(operation, x, y);
            System.out.printf("Результат операции = %.4f", result);
            in.close();
        } else if (a == 2) {
            System.out.println("Введите количество строк: ");
            int lengthArr = in.nextInt();
            String stringArr[] = new String[lengthArr];
            for (int i = 0; i < stringArr.length; i++) {
                System.out.println("Введите строку " + (i + 1));
                stringArr[i] = in.next();
            }
            String s = maxLenght(stringArr);
            System.out.println("Самое длинное слово : " + s);
        } else System.err.println("Вы выбрали несуществующую задачу");
        in.close();
    }

    /**
     * @param operation В параметр передаем математическую операцию
     * @param x         Первое значение
     * @param y         Второе значение
     * @return Результат вычисления
     */
    static double simpleCalculator(String operation, double x, double y) {  //метод для расчетов в зависимости от переданной в консоль операции
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
                if (y == 0) {
                    System.err.println("На ноль делить нельзя");
                    break;
                } else
                    res = x / y;
                break;
            default:
                System.err.println("Введите корректную операцию, возможны следующие: '*','-','+','/'");
        }
        return res;
    }

    /**
     * @param stringArr В метод передаем массив строк
     * @return строку
     */
    static String maxLenght(String[] stringArr) {  //метод для определения самого большого слова в массиве
        int maxLength = 0;
        int maxStrIndex = 0;
        for (int i = 0; i < stringArr.length; i++) {
            int currentLength = (int) stringArr[i].chars().distinct().count();
            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxStrIndex = i;
            }
        }
        return stringArr[maxStrIndex];
    }
}
