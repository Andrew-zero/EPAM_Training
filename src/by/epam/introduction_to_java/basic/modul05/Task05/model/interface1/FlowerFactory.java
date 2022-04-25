package by.epam.introduction_to_java.basic.modul05.Task05.model.interface1;

import by.epam.introduction_to_java.basic.modul05.Task05.model.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.FlowerType;


public interface FlowerFactory {
    Flower createFlower(FlowerType type);
}
