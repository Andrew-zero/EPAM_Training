package by.epam.introduction_to_java.basic.modul05.Task05b.model;

import by.epam.introduction_to_java.basic.modul05.Task05b.model.enum1.WrapType;
import by.epam.introduction_to_java.basic.modul05.Task05b.model.interface1.WrapInterface;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Wrap implements WrapInterface, Serializable {

    @Serial
    private static final long serialVersionUID = 1001L;

    private String name;
    private WrapType wrapType;
    private int price;

    public Wrap(){}

    public Wrap(String name, WrapType wrapType) {
        this.name = name;
        this.wrapType = wrapType;
    }

    public Wrap(String name, WrapType wrapType, int price) {
        this.name = name;
        this.wrapType = wrapType;
        this.price = price;
    }

    @Override
    public void wrap() {
        System.out.println("Заворачиваю в обёртку из " + wrapType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WrapType getWrapType() {
        return wrapType;
    }

    public void setWrapType(WrapType wrapType) {
        this.wrapType = wrapType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wrap wrap = (Wrap) o;
        return price == wrap.price && Objects.equals(name, wrap.name) && wrapType == wrap.wrapType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, wrapType, price);
    }

    @Override
    public String toString() {
        return "Wrap{" +
                "name='" + name + '\'' +
                ", wrapType=" + wrapType +
                ", price=" + price +
                '}';
    }
}
