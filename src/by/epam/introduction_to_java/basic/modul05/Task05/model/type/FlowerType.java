package by.epam.introduction_to_java.basic.modul05.Task05.model.type;

public enum FlowerType {
    ROSE("Роза"),
    PEONY("Пион"),
    TULIP("Тюльпан");

    private String name;

    FlowerType(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
