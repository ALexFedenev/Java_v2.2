package calc_2;

public class Base {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.readingFromConsole();
        calculator.calculate();
        calculator.outputRes();
    }
}
