package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09;

public enum Option {
    ONE("Cписок книг заданного автора"),
    TWO("Cписок книг, выпущенных заданным издательством"),
    THREE("Cписок книг, выпущенных после заданного года");

    private String describe;

    Option(String describe){
        this.describe = describe;
    }

    public String getDescribe() {
        return describe;
    }
}
