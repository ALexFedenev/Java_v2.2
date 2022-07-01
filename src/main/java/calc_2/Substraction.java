package calc_2;

public class Substraction extends Expression {
    public Substraction(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double calc() {
        return left.calc() - right.calc();
    }
}
