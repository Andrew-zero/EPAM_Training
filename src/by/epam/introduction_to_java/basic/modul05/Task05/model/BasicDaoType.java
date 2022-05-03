package by.epam.introduction_to_java.basic.modul05.Task05.model;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public abstract class BasicDaoType<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = 34332322L;

    private T type;
    private BigDecimal price = BigDecimal.ZERO;

    public BasicDaoType() {
    }

    public BasicDaoType(T type) {
        this.type = type;
    }

    public BasicDaoType(T type, BigDecimal price) {
        this.type = type;
        this.price = price;
    }

    public T getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
