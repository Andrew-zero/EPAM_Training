package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09;

public enum Option {
    ONE(1, "Cписок книг заданного автора"),
    TWO(2, "Cписок книг, выпущенных заданным издательством"),
    THREE(3, "Cписок книг, выпущенных после заданного года");

    private int number;
    private String describe;

    Option(int number, String describe){
        this.number = number;
        this.describe = describe;
    }

    public int getNumber() {
        return number;
    }

    public String getDescribe() {
        return describe;
    }
}
