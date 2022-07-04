package calc_2;

public class Multiplicate extends Expression {
    public Multiplicate(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double calc() {

        return left.calc() * right.calc();
    }
}
