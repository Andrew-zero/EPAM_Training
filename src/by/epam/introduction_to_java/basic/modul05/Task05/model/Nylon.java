package by.epam.introduction_to_java.basic.modul05.Task05.model;

import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class Nylon extends Wrap implements Serializable {

    @Serial
    private static final long serialVersionUID = 4300000L;

    public Nylon() {
    }

    public Nylon(WrapType type) {
        super(type);
    }

    public Nylon(WrapType type, BigDecimal price) {
        super(type, price);
    }

    @Override
    public String toString() {
        return "PackageTypeOne{" +
                "name=" + super.getType() +
                "price=" + super.getPrice() +
                '}';
    }
}
