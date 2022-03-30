package by.epam.introduction_to_java.basic.modul05.Task05.service.factory;

import by.epam.introduction_to_java.basic.modul05.Task05.entity.Pion;
import by.epam.introduction_to_java.basic.modul05.Task05.entity.enam.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.entity.interface1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.service.interface1.FlowerFactory;

import java.math.BigDecimal;

public class PionFactory implements FlowerFactory {
    private static PionFactory pionFactory;

    public static PionFactory getInstance() {
        if (pionFactory == null) {
            pionFactory = new PionFactory();
        }

        return pionFactory;
    }

    private PionFactory() {
    }

    @Override
    public Flower createFlower(FlowerType type) {
        return new Pion(type.name(), new BigDecimal("14.12"));
    }
}
