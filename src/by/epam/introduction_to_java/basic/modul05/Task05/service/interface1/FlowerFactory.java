package by.epam.introduction_to_java.basic.modul05.Task05.service.interface1;

import by.epam.introduction_to_java.basic.modul05.Task05.entity.enam.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.entity.interface1.Flower;


public interface FlowerFactory {

    Flower createFlower(FlowerType type);
}
