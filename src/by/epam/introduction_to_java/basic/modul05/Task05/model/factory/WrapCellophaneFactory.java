package by.epam.introduction_to_java.basic.modul05.Task05.model.factory;


import by.epam.introduction_to_java.basic.modul05.Task05.model.WrapCellophane;
import by.epam.introduction_to_java.basic.modul05.Task05.model.enam.WrapType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.WrapFActory;

import java.math.BigDecimal;

public class WrapCellophaneFactory implements WrapFActory {
    private static WrapCellophaneFactory packageTypeTwoFactory;

    public static WrapCellophaneFactory getInstance() {
        if (packageTypeTwoFactory == null) {
            packageTypeTwoFactory = new WrapCellophaneFactory();
        }

        return packageTypeTwoFactory;
    }

    private WrapCellophaneFactory() {
    }

    @Override
    public Wrap createPackage(WrapType type) {
        return new WrapCellophane(type.name(), new BigDecimal("12.12"));
    }
}
