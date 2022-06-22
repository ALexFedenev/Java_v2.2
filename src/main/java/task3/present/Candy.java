package task3.present;

public class Candy extends Present {
    private String form;

    public Candy(String name, Double price, Double weight, String form) {
        super(name, price, weight);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String toString() {
        return "Candy : ( " + super.toString() + " ; Форма = " + form + " )";
    }
}
