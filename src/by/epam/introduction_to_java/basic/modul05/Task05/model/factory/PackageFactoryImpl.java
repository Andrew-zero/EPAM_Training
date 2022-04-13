package by.epam.introduction_to_java.basic.modul05.Task05.model.factory;

import by.epam.introduction_to_java.basic.modul05.Task05.model.enam.WrapType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.WrapFActory;

public class PackageFactoryImpl implements WrapFActory {
    private static PackageFactoryImpl packageFactory;

    public static PackageFactoryImpl getInstance() {
        if (packageFactory == null) {
            packageFactory = new PackageFactoryImpl();
        }

        return packageFactory;
    }

    private PackageFactoryImpl() {
    }

    public Wrap createPackage(WrapType type) {
        Wrap aPackage;

        switch (type) {
            case PAPER -> aPackage = WrapPaperFactory.getInstance().createPackage(WrapType.PAPER);
            case CELLOPHANE -> aPackage = WrapCellophaneFactory.getInstance().createPackage(WrapType.CELLOPHANE);
            default -> throw new IllegalArgumentException("нет таких типов упаковки");
        }

        return aPackage;
    }
}
