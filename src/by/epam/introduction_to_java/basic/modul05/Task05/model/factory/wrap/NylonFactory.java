package by.epam.introduction_to_java.basic.modul05.Task05.model.factory.wrap;

import by.epam.introduction_to_java.basic.modul05.Task05.model.Nylon;
import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.WrapFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;

import java.math.BigDecimal;

public class NylonFactory implements WrapFactory {
    private static NylonFactory wrapNylonFactory;

    public static NylonFactory getInstance() {
        if (wrapNylonFactory == null) {
            wrapNylonFactory = new NylonFactory();
        }

        return wrapNylonFactory;
    }

    private NylonFactory() {
    }

    @Override
    public Wrap createWrap(WrapType type) {
        return new Nylon(type, new BigDecimal("9.22"));
    }
}
