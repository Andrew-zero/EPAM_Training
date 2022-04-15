package by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1;


import by.epam.introduction_to_java.basic.modul05.Task05.model.type.FlowerType;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public abstract class AbstractFlower implements Serializable, Flower {
    @Serial
    private static final long serialVersionUID = 243L;

    private FlowerType type;
    private BigDecimal price;

    public AbstractFlower() {
    }

    public AbstractFlower(FlowerType type) {
        this.type = type;
    }

    public AbstractFlower(FlowerType type, BigDecimal price) {
        this.type = type;
        this.price = price;
    }

    public FlowerType getType() {
        return type;
    }

    @Override
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
        AbstractFlower that = (AbstractFlower) o;
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
