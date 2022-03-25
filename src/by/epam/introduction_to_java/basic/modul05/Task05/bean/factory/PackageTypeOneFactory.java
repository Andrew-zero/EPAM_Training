package by.epam.introduction_to_java.basic.modul05.Task05.bean.factory;

import by.epam.introduction_to_java.basic.modul05.Task05.bean.PackageTypeOne;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.enam.PackageType;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.Package;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.PackageFactory;

import java.math.BigDecimal;

public class PackageTypeOneFactory implements PackageFactory {
    private static PackageTypeOneFactory packageTypeOneFactory;

    public static PackageTypeOneFactory getInstance() {
        if (packageTypeOneFactory == null) {
            packageTypeOneFactory = new PackageTypeOneFactory();
        }

        return packageTypeOneFactory;
    }

    private PackageTypeOneFactory() {
    }

    @Override
    public Package createPackage(PackageType type) {
        return new PackageTypeOne(type.name(), BigDecimal.TEN);
    }
}
