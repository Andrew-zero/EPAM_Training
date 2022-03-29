package by.epam.introduction_to_java.basic.modul05.Task05.service.interface1;


import by.epam.introduction_to_java.basic.modul05.Task05.entity.enam.PackageType;
import by.epam.introduction_to_java.basic.modul05.Task05.entity.interface1.Package;

public interface PackageFactory {

    Package createPackage(PackageType type);
}
