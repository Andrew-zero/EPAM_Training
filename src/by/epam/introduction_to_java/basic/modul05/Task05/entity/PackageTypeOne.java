package by.epam.introduction_to_java.basic.modul05.Task05.entity;

import by.epam.introduction_to_java.basic.modul05.Task05.entity.abstract1.AbstractPackage;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class PackageTypeOne extends AbstractPackage implements Serializable {

    @Serial
    private static final long serialVersionUID = 43L;

    public PackageTypeOne(){}

    public PackageTypeOne(String name) {
        super(name);
    }

    public PackageTypeOne(String name, BigDecimal price){
        super(name, price);
    }

    @Override
    public void packagingFlower() {
        System.out.println("Упаковываю первым методом");
    }

    @Override
    public String toString() {
        return "PackageTypeOne{" +
                "name=" + super.getName() +
                ", price=" + super.getPrice() +
                '}';
    }
}
