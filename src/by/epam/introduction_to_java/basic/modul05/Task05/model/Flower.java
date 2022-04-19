package by.epam.introduction_to_java.basic.modul05.Task05.model;


import by.epam.introduction_to_java.basic.modul05.Task05.model.type.FlowerType;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Flower implements Serializable {
    @Serial
    private static final long serialVersionUID = 243L;

    private FlowerType type;
    private BigDecimal price;

    public Flower() {
    }

    public Flower(FlowerType type) {
        this.type = type;
    }

    public Flower(FlowerType type, BigDecimal price) {
        this.type = type;
        this.price = price;
    }

    public FlowerType getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower that = (Flower) o;
        return type == that.type && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price);
    }

    @Override
    public String toString() {
        return "AbstractFlower{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }
}
