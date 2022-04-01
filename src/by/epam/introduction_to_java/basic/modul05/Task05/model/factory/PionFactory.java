package by.epam.introduction_to_java.basic.modul05.Task05.model.factory;

import by.epam.introduction_to_java.basic.modul05.Task05.exception.ModelException;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Pion;
import by.epam.introduction_to_java.basic.modul05.Task05.model.enam.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.FlowerFactory;

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
