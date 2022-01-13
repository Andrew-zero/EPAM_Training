package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05;

public enum Destination {
    MOSCOW(200),
    MINSK(100),
    TOKYO(1500),
    LONDON(1000),
    NEW_YORK(1500),
    Paris(700),
    BEIJING(900),
    GERMANY(800);

    private int price;

    Destination(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
