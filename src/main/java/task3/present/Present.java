package task3.present;

public abstract class Present {
    private String name;
    private Double price;
    private Double weight;


    public Present(String name, Double price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Название - '" + name + "' ; Цена= " + price + " ; Вес= " + weight;
    }
}
