package by.epam.introduction_to_java.basic.modul05.Task05.model;

import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.AbstractWrap;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class WrapPaper extends AbstractWrap implements Serializable {

    @Serial
    private static final long serialVersionUID = 43L;

    public WrapPaper(){}

    public WrapPaper(String name) {
        super(name);
    }

    public WrapPaper(String name, BigDecimal price){
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
