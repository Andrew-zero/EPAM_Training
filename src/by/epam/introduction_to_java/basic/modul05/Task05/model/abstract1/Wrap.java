package by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1;

import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public abstract class Wrap implements Serializable {
    @Serial
    private static final long serialVersionUID = 143L;

    private WrapType type;
    private BigDecimal price;

    public Wrap() {
    }

    public Wrap(WrapType type) {
        this.type = type;
    }

    public Wrap(WrapType type, BigDecimal price) {
        this.type = type;
        this.price = price;
    }

    public WrapType getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void packagingFlower() {
        if (type.equals(WrapType.PAPER)) {
            System.out.println("Упаковываю в " + getType().getName().replaceFirst("а$", "у"));
        } else {
            System.out.println("Упаковываю в " + getType().getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wrap that = (Wrap) o;
        return type == that.type && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price);
    }

    @Override
    public String toString() {
        return "AbstractWrap{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }
}
