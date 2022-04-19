package by.epam.introduction_to_java.basic.modul05.Task05.model.factory.wrap;

import by.epam.introduction_to_java.basic.modul05.Task05.model.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.WrapFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;

public class WrapFactoryImpl implements WrapFactory {
    private static WrapFactoryImpl warpFactory;

    public static WrapFactoryImpl getInstance() {
        if (warpFactory == null) {
            warpFactory = new WrapFactoryImpl();
        }

        return warpFactory;
    }

    private WrapFactoryImpl() {
    }

    public Wrap createWrap(WrapType type) {
        Wrap wrap;

        switch (type) {
            case PAPER -> wrap = PaperFactory.getInstance().createWrap(type);
            case CELLOPHANE -> wrap = CellophaneFactory.getInstance().createWrap(type);
            case NYLON -> wrap = NylonFactory.getInstance().createWrap(type);
            default -> throw new IllegalArgumentException("нет таких типов упаковки");
        }

        return wrap;
    }
}
