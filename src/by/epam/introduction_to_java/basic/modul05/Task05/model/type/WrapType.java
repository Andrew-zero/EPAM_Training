package by.epam.introduction_to_java.basic.modul05.Task05.model.type;

public enum WrapType {
    PAPER("Бумага"),
    CELLOPHANE("Целофан"),
    NYLON("Нейлон");

    private String name;

    WrapType(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
