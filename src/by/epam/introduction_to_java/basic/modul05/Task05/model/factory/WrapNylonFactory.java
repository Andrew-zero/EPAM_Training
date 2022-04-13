package by.epam.introduction_to_java.basic.modul05.Task05.model.factory;

import by.epam.introduction_to_java.basic.modul05.Task05.model.WrapNylon;
import by.epam.introduction_to_java.basic.modul05.Task05.model.enam.WrapType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.WrapFActory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Wrap;

import java.math.BigDecimal;

public class WrapNylonFactory implements WrapFActory {
    private static WrapNylonFactory wrapNylonFactory;

    public static WrapNylonFactory getInstance() {
        if (wrapNylonFactory == null) {
            wrapNylonFactory = new WrapNylonFactory();
        }

        return wrapNylonFactory;
    }

    private WrapNylonFactory() {
    }

    @Override
    public Wrap createPackage(WrapType type) {
        return new WrapNylon(type.name(), new BigDecimal("9.22"));
    }
}
