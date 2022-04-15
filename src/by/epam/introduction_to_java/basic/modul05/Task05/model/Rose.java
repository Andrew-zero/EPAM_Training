package by.epam.introduction_to_java.basic.modul05.Task05.model;

import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.FlowerType;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class Rose extends Flower implements Serializable {
    @Serial
    private static final long serialVersionUID = 2430L;

    public Rose() {
    }

    public Rose(FlowerType type) {
        super(type);
    }

    public Rose(FlowerType type, BigDecimal price) {
        super(type, price);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "type='" + super.getType() + '\'' +
                "price=" + super.getPrice() +
                '}';
    }
}
