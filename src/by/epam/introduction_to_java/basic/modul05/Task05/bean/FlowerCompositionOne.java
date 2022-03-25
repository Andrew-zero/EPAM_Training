package by.epam.introduction_to_java.basic.modul05.Task05.bean;

import by.epam.introduction_to_java.basic.modul05.Task05.bean.abstract1.AbstractFlowerComposition;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.enam.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.enam.PackageType;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.factory.FlowerFactoryImpl;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.factory.PackageFactoryImpl;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.FlowerFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.Package;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.PackageFactory;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;

public class FlowerCompositionOne extends AbstractFlowerComposition implements Serializable {
    @Serial
    private static final long serialVersionUID = 3403L;

    public FlowerCompositionOne() {
    }

    public FlowerCompositionOne(String name) {
        super(name);
    }

    @Override
    public FlowerCompositionOne makeComposition() {
        FlowerFactory flowerFactory = FlowerFactoryImpl.getInstance();
        PackageFactory packageFactory = PackageFactoryImpl.getInstance();

        for (int i = 0; i < 30; i++) {
            Flower flower = flowerFactory.createFlower(FlowerType.ROSE);
            add(flower);
            setTotalPrice(getTotalPrice().add(flower.getPrice()));
        }

        Package aPackage = packageFactory.createPackage(PackageType.ONE);
        System.out.println(aPackage);
        this.setaPackage(aPackage);
        this.setTotalPrice(getTotalPrice().add(aPackage.getPrice()));

        return this;
    }

    @Override
    public String toString() {
        return "FlowerComposition{" +
                "name=" + super.getName() +
                ", flower=" + Arrays.toString(super.toArray()) +
                ", aPackage=" + super.getaPackage() +
                ", totalPrice=" + super.getTotalPrice() +
                '}';
    }
}
