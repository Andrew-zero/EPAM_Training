package by.epam.introduction_to_java.basic.modul05.Task05.service.command;

import by.epam.introduction_to_java.basic.modul05.Task05.exception.ModelException;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Wrap;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class AbstractBouquet implements Serializable{
    @Serial
    private static final long serialVersionUID = 343L;

    private String name;
    private BigDecimal totalPrice = BigDecimal.ZERO;
    private Wrap wrap;
    private List<Flower> flowerList = new ArrayList<>();

    public AbstractBouquet() {
    }

    public AbstractBouquet(String name) {
        try {
            if (name.isEmpty()) {
                throw new ModelException("The name Composition cannot be empty");
            }
        } catch (ModelException e) {
            e.printStackTrace();
            return;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Wrap getWrap() {
        return wrap;
    }

    public void setWrap(Wrap wrap) {
        this.wrap = wrap;
    }

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractBouquet that = (AbstractBouquet) o;
        return Objects.equals(name, that.name) && Objects.equals(totalPrice, that.totalPrice) && Objects.equals(wrap, that.wrap) && Objects.equals(flowerList, that.flowerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalPrice, wrap, flowerList);
    }

    @Override
    public String toString() {
        return "AbstractFlowerComposition{" +
                "name='" + name + '\'' +
                ", totalPrice=" + totalPrice +
                ", aPackage=" + wrap +
                ", flowerList=" + flowerList +
                '}';
    }
}
