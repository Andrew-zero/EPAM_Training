package by.epam.introduction_to_java.basic.modul05.Task05.model.factory.wrap;

import by.epam.introduction_to_java.basic.modul05.Task05.model.Paper;
import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.WrapFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;

import java.math.BigDecimal;

public class PaperFactory implements WrapFactory {
    private static PaperFactory packageTypeOneFactory;

    public static PaperFactory getInstance() {
        if (packageTypeOneFactory == null) {
            packageTypeOneFactory = new PaperFactory();
        }

        return packageTypeOneFactory;
    }

    private PaperFactory() {
    }

    @Override
    public Wrap createWrap(WrapType type) {
        return new Paper(type, BigDecimal.TEN);
    }
}
