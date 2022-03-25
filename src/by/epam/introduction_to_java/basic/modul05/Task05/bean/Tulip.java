package by.epam.introduction_to_java.basic.modul05.Task05.bean;

import by.epam.introduction_to_java.basic.modul05.Task05.bean.abstract1.AbstractFlower;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Tulip extends AbstractFlower implements Serializable {
    @Serial
    private static final long serialVersionUID = 2432L;

    public Tulip(String name) {
        super(name);
    }

    public Tulip(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "name=" + super.getName() +
                "price=" + super.getPrice() +
                '}';
    }
}
