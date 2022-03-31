package by.epam.introduction_to_java.basic.modul05.Task05.model.interface1;


import by.epam.introduction_to_java.basic.modul05.Task05.model.enam.PackageType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Package;

public interface PackageFactory {

    Package createPackage(PackageType type);
}
