package calc_2;

public class Sum extends Expression {
    public Sum(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double calc() {

        return left.calc() + right.calc();
    }
}
