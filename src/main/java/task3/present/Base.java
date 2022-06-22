package task3.present;

public class Base {
    public static void main(String[] args) {
        double totalWeight = 0;          //Общий вес
        double totalCost = 0;            //Общая стоимость
        int i = 0;
        Jellybean jellybean1 = new Jellybean("Жуйка", 50.0, 40.0, "Желе");
        Chocolate chocolate1 = new Chocolate("Аленка", 100.0, 80.0, "Плиточный");
        Candy candy1 = new Candy("Mars", 150.0, 100.0, "Шар");

        Present[] box = {jellybean1, chocolate1, candy1};           //собран массив с объектами
        for (Present present1 : box) {                              //перебираем подарок, считаем цену,вес, выводим общую информацию
            System.out.println("В подарке под номером " + ++i + " : " + present1.toString());
            totalCost += present1.getPrice();
            totalWeight += present1.getWeight();
        }
        System.out.println("Общая стоимость подарка: " + totalCost);
        System.out.println("Общий вес подарка: " + totalWeight);
    }
}
