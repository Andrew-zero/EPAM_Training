package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08;

import java.util.Enumeration;

public enum Options {
    ONE("Cписок покупателей в алфавитном порядке", 1),
    TWO("Cписок покупателей, у которых номер кредитной карточки находится в заданном интервале", 2);

    private int number;
    private String discribe;

    Options(String discribe, int number) {
        this.discribe = discribe;
        this.number = number;
    }

    public String getDiscribe() {
        return discribe;
    }

    public int getNumber() {
        return number;
    }

    public void setDiscribe(String discribe) {
        this.discribe = discribe;
    }
}
