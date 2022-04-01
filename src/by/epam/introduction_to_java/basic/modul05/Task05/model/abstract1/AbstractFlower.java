package by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1;


import by.epam.introduction_to_java.basic.modul05.Task05.exception.ModelException;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Flower;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public abstract class AbstractFlower implements Serializable, Flower {
    @Serial
    private static final long serialVersionUID = 243L;

    private String name;
    private BigDecimal price;

    public AbstractFlower() {
    }

    public AbstractFlower(String name) {
        try {
            if (name.isEmpty()) {
                throw new ModelException("The name Flower cannot be empty");
            }
        } catch (ModelException e) {
            e.printStackTrace();
            return;
        }

        this.name = name;
    }

    public AbstractFlower(String name, BigDecimal price){
        try {
            if (name.isEmpty()) {
                throw new ModelException("The name Flower cannot be empty");
            }
        }catch (ModelException e){
            e.printStackTrace();
            return;
        }
        this.name = name;

        try {
            if (price.doubleValue() < 0) {
                throw new ModelException("The price Flower cannot be low then '0'");
            }
        }catch (ModelException e){
            e.printStackTrace();
            return;
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
