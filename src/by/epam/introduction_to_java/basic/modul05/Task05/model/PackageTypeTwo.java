package by.epam.introduction_to_java.basic.modul05.Task05.model;

import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.AbstractPackage;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class PackageTypeTwo extends AbstractPackage implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;

    public PackageTypeTwo(){}

    public PackageTypeTwo(String name) {
        super(name);
    }

    public PackageTypeTwo(String name, BigDecimal price){
        super(name, price);
    }

    @Override
    public void packagingFlower() {
        System.out.println("Упаковываю вторым методом");
    }

    @Override
    public String toString() {
        return "PackageTypeTwo{" +
                "name=" + super.getName() +
                "price=" + super.getPrice() +
                '}';
    }
}
