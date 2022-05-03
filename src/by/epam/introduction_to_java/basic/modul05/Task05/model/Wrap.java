package by.epam.introduction_to_java.basic.modul05.Task05.model;

import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Wrap extends BasicDaoType<WrapType> implements Serializable {
    @Serial
    private static final long serialVersionUID = 143L;

    public Wrap() {
    }

    public Wrap(WrapType type) {
        super(type);
    }

    public Wrap(WrapType type, BigDecimal price) {
        super(type, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wrap wrap = (Wrap) o;
        return Objects.equals(getType(), wrap.getType()) && Objects.equals(getPrice(), wrap.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getPrice());
    }

    @Override
    public String toString() {
        return "Wrap{" +
                "type=" + getType() +
                ", price=" + getPrice() +
                '}';
    }
}
