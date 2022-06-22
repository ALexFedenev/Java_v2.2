package task3.present;

public class Jellybean extends Present {
    private String composition;

    public Jellybean(String name, Double price, Double weight, String composition) {
        super(name, price, weight);
        this.composition = composition;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String toString() {
        return "Jellybean ( " + super.toString() + " ; Состав = " + composition+" )";
    }
}
