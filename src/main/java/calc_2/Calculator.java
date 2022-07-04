package calc_2;

import java.util.Scanner;

/**
 * @author Alex Fedenev
 * @see #readingFromConsole() считывает строку из консоли
 * @see #calculate() присваивает полю типа Expression тот или иной расширяющий его объект
 * @see #parseExpression String разбирает входную строку на объекты
 * @see #outputRes() вызывает метод вычислений и производит форматированный вывод в консоль
 */
public class Calculator {
    private String stringFromConsole;
    private Expression resultExpression;

    public void readingFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение из четырёх операций:");
        stringFromConsole = in.nextLine();
        in.close();
    }

    public void calculate() {
        resultExpression = parseExpression(stringFromConsole);
    }


    private Expression parseExpression(String str) {

        int indexPlus = str.indexOf("+");
        if (indexPlus != -1) {
            String leftStr = str.substring(0, indexPlus);
            String rightStr = str.substring(indexPlus + 1);
            Expression left = parseExpression(leftStr);
            Expression right = parseExpression(rightStr);
            return new Sum(left, right);
        }
        int indexMinus = str.lastIndexOf("-");
        if (indexMinus != -1) {
            String leftStr = str.substring(0, indexMinus);
            String rightStr = str.substring(indexMinus + 1);
            Expression left = parseExpression(leftStr);
            Expression right = parseExpression(rightStr);
            return new Substraction(left, right);
        }
        int indexMultiply = str.lastIndexOf("*");
        if (indexMultiply != -1) {
            String leftStr = str.substring(0, indexMultiply);
            String rightStr = str.substring(indexMultiply + 1);
            Expression left = parseExpression(leftStr);
            Expression right = parseExpression(rightStr);
            return new Multiplicate(left, right);
        }
        int indexDivision = str.lastIndexOf("/");
        if (indexDivision != -1) {
            String leftStr = str.substring(0, indexDivision);
            String rightStr = str.substring(indexDivision + 1);
            Expression left = parseExpression(leftStr);
            Expression right = parseExpression(rightStr);
            return new Division(left, right);
        }

        return new Value(Double.parseDouble(str));
    }

    public void outputRes() {

        System.out.printf("Результат = %.4f", resultExpression.calc());
    }
}
