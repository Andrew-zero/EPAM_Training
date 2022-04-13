package by.epam.introduction_to_java.basic.modul05.Task05b.model;

import by.epam.introduction_to_java.basic.modul05.Task05b.model.enum1.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05b.model.interface1.FlowerInterface;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Flower implements FlowerInterface, Serializable {

    @Serial
    private static final long serialVersionUID = 1000L;

    private String name;
    private FlowerType type;
    private int price;

    public Flower(){}

    public Flower(String name, FlowerType type) {
        this.name = name;
        this.type = type;
    }

    public Flower(String name, FlowerType type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public void smell() {
        System.out.printf("Smells like a %s\n", type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlowerType getType() {
        return type;
    }

    public void setType(FlowerType type) {
        this.type = type;
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
        Flower flower = (Flower) o;
        return price == flower.price && Objects.equals(name, flower.name) && type == flower.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, price);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}
