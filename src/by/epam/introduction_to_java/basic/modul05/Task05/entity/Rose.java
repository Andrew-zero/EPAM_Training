package by.epam.introduction_to_java.basic.modul05.Task05.entity;

import by.epam.introduction_to_java.basic.modul05.Task05.entity.abstract1.AbstractFlower;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class Rose extends AbstractFlower implements Serializable {
    @Serial
    private static final long serialVersionUID = 2430L;

    public Rose() {
    }

    public Rose(String name) {
        super(name);
    }

    public Rose(String name, BigDecimal price) {
        super(name, price);
    }
}
