package by.epam.introduction_to_java.basic.modul05.Task05b.model;

import by.epam.introduction_to_java.basic.modul05.Task05b.model.enum1.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05b.model.interface1.FlowerInterface;

public class Flower implements FlowerInterface {

    private String name;
    private FlowerType type;
    private int price;

    @Override
    public void smell() {
        System.out.printf("Smells like a %s", type);
    }
}
