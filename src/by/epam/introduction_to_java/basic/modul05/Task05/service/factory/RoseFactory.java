package by.epam.introduction_to_java.basic.modul05.Task05.service.factory;

import by.epam.introduction_to_java.basic.modul05.Task05.entity.Rose;
import by.epam.introduction_to_java.basic.modul05.Task05.entity.enam.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.entity.interface1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.service.interface1.FlowerFactory;

import java.math.BigDecimal;

public class RoseFactory implements FlowerFactory {
    private static RoseFactory roseFactory;

    public static RoseFactory getInstance() {
        if (roseFactory == null) {
            roseFactory = new RoseFactory();
        }

        return roseFactory;
    }

    private RoseFactory() {
    }

    @Override
    public Flower createFlower(FlowerType type) {
        return new Rose(type.name(), new BigDecimal("7.12"));
    }
}
