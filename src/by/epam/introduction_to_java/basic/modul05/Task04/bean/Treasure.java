package by.epam.introduction_to_java.basic.modul05.Task04.bean;


import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Treasure implements Serializable {

    @Serial
    private static final long serialVersionUID = 100L;

    private String name;
    private Type type;
    private int price;

    public Treasure() {

    }

    public Treasure(String name, Type type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
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
        Treasure treasure = (Treasure) o;
        return price == treasure.price && Objects.equals(name, treasure.name) && type == treasure.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, price);
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}
