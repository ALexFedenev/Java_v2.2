import calc_2.Calculator;
import calc_2.MyArifmeticException;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {
    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        calculator.setStringFromConsole("2+2+15");
        Assert.assertEquals("Результат операции 2+2+15 должен быть равен 19", 19, calculator.getOutRes(), 0);
    }

    @Test
    public void testSubctraction() {
        calculator.setStringFromConsole("2-2-15");
        Assert.assertEquals("Результат операции 2-2-15 должен быть равен -15", -15, calculator.getOutRes(), 0);
    }

    @Test
    public void testMultiplicate() {
        calculator.setStringFromConsole("2*2*15");
        Assert.assertEquals("Результат операции 2*2*15 должен быть равен 60", 60, calculator.getOutRes(), 0);
    }

    @Test
    public void testDivision() {
        calculator.setStringFromConsole("15/3/5");
        Assert.assertEquals("Результат операции 15/3/5 должен быть равен 1", 1, calculator.getOutRes(), 0);
    }

    @Test
    public void testExpression() {
        calculator.setStringFromConsole("15*3-5+6/2");
        Assert.assertEquals("Результат операции 15*3-5+6/2 должен быть равен 43", 43, calculator.getOutRes(), 0);
    }


    @Test(expected = MyArifmeticException.class)
    public void testDivisionByZero() {
        calculator.setStringFromConsole("2/0");
        calculator.getOutRes();
    }

    @Test(expected = NumberFormatException.class)
    public void testNumberFormatException() {
        calculator.setStringFromConsole("2a0");
        calculator.getOutRes();
    }
}


