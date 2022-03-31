package by.epam.introduction_to_java.basic.modul05.Task05.model.factory;


import by.epam.introduction_to_java.basic.modul05.Task05.model.PackageTypeTwo;
import by.epam.introduction_to_java.basic.modul05.Task05.model.enam.PackageType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Package;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.PackageFactory;

import java.math.BigDecimal;

public class PackageTypeTwoFactory implements PackageFactory {
    private static PackageTypeTwoFactory packageTypeTwoFactory;

    public static PackageTypeTwoFactory getInstance() {
        if (packageTypeTwoFactory == null) {
            packageTypeTwoFactory = new PackageTypeTwoFactory();
        }

        return packageTypeTwoFactory;
    }

    private PackageTypeTwoFactory() {
    }

    @Override
    public Package createPackage(PackageType type) {
        return new PackageTypeTwo(type.name(), new BigDecimal("12.12"));
    }
}
