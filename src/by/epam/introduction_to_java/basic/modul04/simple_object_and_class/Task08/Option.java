package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08;

public enum Option {
    ONE("Cписок покупателей в алфавитном порядке"),
    TWO("Cписок покупателей, у которых номер кредитной карточки находится в заданном интервале");

    private String describe;

    Option(String describe) {
        this.describe = describe;
    }

    public String getDescribe() {
        return describe;
    }
}
