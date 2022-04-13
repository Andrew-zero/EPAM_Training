package by.epam.introduction_to_java.basic.modul05.Task05.model.factory;

import by.epam.introduction_to_java.basic.modul05.Task05.model.WrapPaper;
import by.epam.introduction_to_java.basic.modul05.Task05.model.enam.WrapType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.WrapFActory;

import java.math.BigDecimal;

public class WrapPaperFactory implements WrapFActory {
    private static WrapPaperFactory packageTypeOneFactory;

    public static WrapPaperFactory getInstance() {
        if (packageTypeOneFactory == null) {
            packageTypeOneFactory = new WrapPaperFactory();
        }

        return packageTypeOneFactory;
    }

    private WrapPaperFactory() {
    }

    @Override
    public Wrap createPackage(WrapType type) {
        return new WrapPaper(type.name(), BigDecimal.TEN);
    }
}
