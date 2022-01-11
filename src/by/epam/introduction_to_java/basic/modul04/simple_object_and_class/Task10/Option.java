package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10;


public enum Option {
    ONE("Cписок рейсов для заданного пункта назначения"),
    TWO("Cписок рейсов для заданного дня недели"),
    THREE("Cписок рейсов для заданного дня недели, время вылета для которых больше заданного");

    private String describe;

    Option(String describe) {
        this.describe = describe;
    }

    public String getDescribe() {
        return describe;
    }
}
