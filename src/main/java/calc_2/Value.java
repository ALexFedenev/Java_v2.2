package calc_2;

public class Value extends Expression {
    private double value;

    public Value(double value) {
        super(null, null);
        this.value = value;
    }

    @Override
    public double calc() {

        return value;
    }
}
