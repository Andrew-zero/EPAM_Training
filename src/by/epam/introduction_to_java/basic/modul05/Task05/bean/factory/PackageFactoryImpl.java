package by.epam.introduction_to_java.basic.modul05.Task05.bean.factory;

import by.epam.introduction_to_java.basic.modul05.Task05.bean.enam.PackageType;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.Package;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.PackageFactory;

public class PackageFactoryImpl implements PackageFactory {
    private static PackageFactoryImpl packageFactory;

    public static PackageFactoryImpl getInstance() {
        if (packageFactory == null) {
            packageFactory = new PackageFactoryImpl();
        }

        return packageFactory;
    }

    private PackageFactoryImpl() {
    }

    public Package createPackage(PackageType type) {
        Package aPackage;

        switch (type) {
            case ONE -> aPackage = PackageTypeOneFactory.getInstance().createPackage(type);
            case TWO -> aPackage = PackageTypeTwoFactory.getInstance().createPackage(type);
            default -> throw new IllegalArgumentException("нет таких типов упаковки");
        }

        return aPackage;
    }
}
