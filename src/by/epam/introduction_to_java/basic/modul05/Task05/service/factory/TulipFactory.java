package by.epam.introduction_to_java.basic.modul05.Task05.service.factory;


import by.epam.introduction_to_java.basic.modul05.Task05.entity.enam.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.entity.Tulip;
import by.epam.introduction_to_java.basic.modul05.Task05.entity.interface1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.service.interface1.FlowerFactory;

import java.math.BigDecimal;

public class TulipFactory implements FlowerFactory {
    private static TulipFactory tulipFactory;

    public static TulipFactory getInstance() {
        if (tulipFactory == null) {
            tulipFactory = new TulipFactory();
        }

        return tulipFactory;
    }

    private TulipFactory() {
    }

    @Override
    public Flower createFlower(FlowerType type) {
        return new Tulip(type.name(), new BigDecimal("3.50"));
    }
}
