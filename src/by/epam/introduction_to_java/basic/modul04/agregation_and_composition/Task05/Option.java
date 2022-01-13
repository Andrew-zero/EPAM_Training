package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05;

public enum Option {
    Cruise(1000,"Круиз"),
    Excursion(50, "Экскурсия"),
    Relaxation(200, "Отдых"),
    ShoppingTour(100, "Шоппинг"),
    Treatment(400, "Лечение");

    private String describe;
    private int price;

    Option(int price, String describe){
        this.price = price;
        this.describe = describe;
    }

    public String getDescribe() {
        return describe;
    }

    public int getPrice() {
        return price;
    }
}
