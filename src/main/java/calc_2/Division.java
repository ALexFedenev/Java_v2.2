package calc_2;

public class Division extends Expression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double calc() {
        if (right.calc() == 0) {
            try {
                throw new RuntimeException();
            } catch (RuntimeException rex) {
                System.err.println("Делить на ноль нельзя");
                rex.printStackTrace();
            }
        }
        return left.calc() / right.calc();
    }
}
