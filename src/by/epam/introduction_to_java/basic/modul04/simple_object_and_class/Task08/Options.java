package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08;

public enum Options {
    ONE("Cписок покупателей в алфавитном порядке"),
    TWO("Cписок покупателей, у которых номер кредитной карточки находится в заданном интервале");

    private String discribe;

    Options(String discribe) {
        this.discribe = discribe;
    }

    public String getDiscribe() {
        return discribe;
    }

    public void setDiscribe(String discribe) {
        this.discribe = discribe;
    }
}
