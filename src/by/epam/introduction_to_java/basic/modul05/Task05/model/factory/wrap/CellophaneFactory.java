package by.epam.introduction_to_java.basic.modul05.Task05.model.factory.wrap;


import by.epam.introduction_to_java.basic.modul05.Task05.model.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.WrapFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;

import java.math.BigDecimal;

public class CellophaneFactory implements WrapFactory {
    private static CellophaneFactory packageTypeTwoFactory;

    public static CellophaneFactory getInstance() {
        if (packageTypeTwoFactory == null) {
            packageTypeTwoFactory = new CellophaneFactory();
        }

        return packageTypeTwoFactory;
    }

    private CellophaneFactory() {
    }

    @Override
    public Wrap createWrap(WrapType type) {
        return new Wrap(type, new BigDecimal("12.12"));
    }
}
