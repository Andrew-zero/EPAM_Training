package by.epam.introduction_to_java.basic.modul05.Task05.model.factory;

import by.epam.introduction_to_java.basic.modul05.Task05.exception.ModelException;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Rose;
import by.epam.introduction_to_java.basic.modul05.Task05.model.enam.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.FlowerFactory;

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
