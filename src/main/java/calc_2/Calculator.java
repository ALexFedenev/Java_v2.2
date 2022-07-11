package calc_2;

/**
 * @author Alex Fedenev
 * @see #parseExpression String разбирает входную строку на объекты
 */
public class Calculator {
    private String stringFromConsole;
    private double outRes;
    public Calculator() {
    }

    public Calculator(String stringFromConsole) {

        this.stringFromConsole = stringFromConsole;
    }

    public String getStringFromConsole() {

        return stringFromConsole;
    }

    public void setStringFromConsole(String stringFromConsole) {
        this.stringFromConsole = stringFromConsole;
    }

    public double getOutRes() {
        Expression resultExpression = parseExpression(stringFromConsole);
        outRes = resultExpression.calc();
        return outRes;
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
}

