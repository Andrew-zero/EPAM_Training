package by.epam.introduction_to_java.basic.modul05.Task05.model;

import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.AbstractWrap;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class WrapNylon extends AbstractWrap implements Serializable {

    @Serial
    private static final long serialVersionUID = 4300000L;

    public WrapNylon() {
    }

    public WrapNylon(String name) {
        super(name);
    }

    public WrapNylon(String name, BigDecimal price) {
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
