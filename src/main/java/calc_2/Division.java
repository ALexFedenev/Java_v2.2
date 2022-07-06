package calc_2;

public class Division extends Expression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double calc() throws MyArifmeticException{
                if (right.calc() == 0) {
                throw new MyArifmeticException("Нельзя делить на  ноль");
            }
        return left.calc() / right.calc();
    }
}
