package by.epam.introduction_to_java.basic.modul05.Task05.model;

import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.FlowerType;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class Peony extends Flower implements Serializable {
    @Serial
    private static final long serialVersionUID = 2431L;

    public Peony() {
    }

    public Peony(FlowerType type) {
        super(type);
    }

    public Peony(FlowerType type, BigDecimal price) {
        super(type, price);
    }

    @Override
    public String toString() {
        return "Pion{" +
                "type='" + super.getType() + '\'' +
                "price=" + super.getPrice() +
                '}';
    }
}
