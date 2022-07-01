package calc_2;

public class Division extends Expression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double calc() {
        return left.calc() / right.calc();
    }
}
