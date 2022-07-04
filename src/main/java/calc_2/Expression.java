package calc_2;

public abstract class Expression {
    protected Expression left;
    protected Expression right;

    public Expression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public abstract double calc();
}
