package by.epam.introduction_to_java.basic.modul05.Task05.bean.abstract1;


import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.Flower;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public abstract class AbstractFlower implements Serializable, Flower {
    @Serial
    private static final long serialVersionUID = 243L;

    private String name;
    private BigDecimal price;

    public AbstractFlower(){}

    public AbstractFlower(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("The name cannot be empty");
        }
        this.name = name;
    }

    public AbstractFlower(String name, BigDecimal price) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("The name cannot be empty");
        }
        this.name = name;
        if (price.doubleValue() < 0) {
            throw new IllegalArgumentException("The price cannot be low then '0'");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public void smell() {
        System.out.println("Пахнет как " + getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractFlower that = (AbstractFlower) o;
        return Objects.equals(name, that.name) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
