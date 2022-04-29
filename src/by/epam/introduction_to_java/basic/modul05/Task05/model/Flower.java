package by.epam.introduction_to_java.basic.modul05.Task05.model;


import by.epam.introduction_to_java.basic.modul05.Task05.model.type.FlowerType;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Flower extends BasicDaoType<FlowerType> implements Serializable {
    @Serial
    private static final long serialVersionUID = 243L;

    public Flower() {

    }

    public Flower(FlowerType type) {
        super(type);
    }

    public Flower(FlowerType type, BigDecimal price) {
        super(type, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Objects.equals(super.getType(), flower.getType()) && Objects.equals(getPrice(), flower.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getPrice());
    }

    @Override
    public String toString() {
        return "Flower{" +
                "type=" + getType() +
                "price=" + getPrice() +
                "}";
    }
}
