package by.epam.introduction_to_java.basic.modul05.Task05b.model.factory.interface1;

import by.epam.introduction_to_java.basic.modul05.Task05b.model.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05b.model.enum1.FlowerType;

public interface FlowerFactory {
    Flower createFlower(FlowerType type);
}
