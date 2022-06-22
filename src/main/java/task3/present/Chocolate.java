package task3.present;

public class Chocolate extends Present {
    private String type;

    public Chocolate(String name, Double price, Double weight,String type) {
        super(name, price, weight);
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String toString() {
        return "Chocolate : ( " + super.toString() + " ; Тип = " + type+" )";
    }
}
