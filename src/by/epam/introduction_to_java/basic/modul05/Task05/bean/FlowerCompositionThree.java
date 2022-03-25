package by.epam.introduction_to_java.basic.modul05.Task05.bean;

import by.epam.introduction_to_java.basic.modul05.Task05.bean.abstract1.AbstractFlowerComposition;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.enam.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.enam.PackageType;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.factory.FlowerFactoryImpl;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.factory.PackageFactoryImpl;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.FlowerComposition;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.FlowerFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.Package;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.PackageFactory;

import java.io.Serial;
import java.io.Serializable;

public class FlowerCompositionThree extends AbstractFlowerComposition implements Serializable {
    @Serial
    private static final long serialVersionUID = 34001233L;

    public FlowerCompositionThree() {
    }

    public FlowerCompositionThree(String name) {
        super(name);
    }

    @Override
    public FlowerComposition makeComposition() {
        FlowerFactory flowerFactory = FlowerFactoryImpl.getInstance();
        PackageFactory packageFactory = PackageFactoryImpl.getInstance();

        for (int i = 0; i < 18; i++) {
            Flower flower = flowerFactory.createFlower(FlowerType.PION);
            add(flower);
            setTotalPrice(getTotalPrice().add(flower.getPrice()));
        }

        for (int i = 0; i < 36; i++) {
            Flower flower = flowerFactory.createFlower(FlowerType.ROSE);
            add(flower);
            setTotalPrice(getTotalPrice().add(flower.getPrice()));
        }

        Package aPackage = packageFactory.createPackage(PackageType.THREE);
        setaPackage(aPackage);
        setTotalPrice(getTotalPrice().add(aPackage.getPrice()));

        return this;
    }

    @Override
    public String toString() {
        return "FlowerComposition{" +
                "name=" + super.getName() +
                ", aPackage=" + super.getaPackage() +
                ", totalPrice=" + super.getTotalPrice() +
                '}';
    }
}
