package by.epam.introduction_to_java.basic.modul05.Task05.entity;

import by.epam.introduction_to_java.basic.modul05.Task05.entity.abstract1.AbstractFlower;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class Pion extends AbstractFlower implements Serializable {
    @Serial
    private static final long serialVersionUID = 2431L;

    public Pion() {
    }

    public Pion(String name) {
        super(name);
    }

    public Pion(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Pion{" +
                "name='" + super.getName() + '\'' +
                "price=" + super.getPrice() +
                '}';
    }
}
