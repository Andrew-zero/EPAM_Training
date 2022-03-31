package by.epam.introduction_to_java.basic.modul05.Task05.model;

import by.epam.introduction_to_java.basic.modul05.Task05.model.enam.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.AbstractFlowerComposition;
import by.epam.introduction_to_java.basic.modul05.Task05.model.enam.PackageType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.FlowerFactoryImpl;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.PackageFactoryImpl;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.*;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Package;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.FlowerComposition;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.FlowerFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.PackageFactory;

import java.io.Serial;
import java.io.Serializable;

public class FlowerCompositionTwo extends AbstractFlowerComposition implements FlowerComposition, Serializable {
    @Serial
    private static final long serialVersionUID = 340033L;

    public FlowerCompositionTwo() {
    }

    public FlowerCompositionTwo(String name) {
        super(name);
    }

    @Override
    public FlowerCompositionTwo makeComposition() {
        FlowerFactory flowerFactory = FlowerFactoryImpl.getInstance();
        PackageFactory packageFactory = PackageFactoryImpl.getInstance();

        for (int i = 0; i < 100; i++) {
            Flower flower = flowerFactory.createFlower(FlowerType.TULIP);
            getFlowerList().add(flower);
            setTotalPrice(getTotalPrice().add(flower.getPrice()));
        }

        Package aPackage = packageFactory.createPackage(PackageType.TWO);
        setaPackage(aPackage);
        setTotalPrice(getTotalPrice().add(aPackage.getPrice()));

        return this;
    }

    @Override
    public String toString() {
        return "FlowerComposition{" +
                "name='" + super.getName() + '\'' +
                ", totalPrice=" + super.getTotalPrice() +
                ", aPackage=" + super.getaPackage() +
                ", flowerList=" + super.getFlowerList() +
                '}';
    }
}
