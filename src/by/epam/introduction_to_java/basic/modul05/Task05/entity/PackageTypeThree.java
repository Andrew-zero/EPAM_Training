package by.epam.introduction_to_java.basic.modul05.Task05.entity;

import by.epam.introduction_to_java.basic.modul05.Task05.entity.abstract1.AbstractPackage;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class PackageTypeThree extends AbstractPackage implements Serializable {

    @Serial
    private static final long serialVersionUID = 4300000L;

    public PackageTypeThree() {
    }

    public PackageTypeThree(String name) {
        super(name);
    }

    public PackageTypeThree(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public void packagingFlower() {
            System.out.println("Упаковываю третим методом");
    }

    @Override
    public String toString() {
        return "PackageTypeOne{" +
                "name=" + super.getName() +
                "price=" + super.getPrice() +
                '}';
    }
}
