package by.epam.introduction_to_java.basic.modul05.Task05.model.factory;

import by.epam.introduction_to_java.basic.modul05.Task05.model.Peony;
import by.epam.introduction_to_java.basic.modul05.Task05.model.enam.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.FlowerFactory;

import java.math.BigDecimal;

public class PeonyFactory implements FlowerFactory {
    private static PeonyFactory peonyFactory;

    public static PeonyFactory getInstance() {
        if (peonyFactory == null) {
            peonyFactory = new PeonyFactory();
        }

        return peonyFactory;
    }

    private PeonyFactory() {
    }

    @Override
    public Flower createFlower(FlowerType type) {
        return new Peony(type.name(), new BigDecimal("14.12"));
    }
}
