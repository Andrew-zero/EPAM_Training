package by.epam.introduction_to_java.basic.modul05.Task04.bean;

import java.io.Serializable;
import java.util.Objects;

public class Dragon implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private DragonProperty dragonProperty;

    public Dragon() {
    }

    public Dragon(String name, DragonProperty dragonProperty) {
        this.name = name;
        this.dragonProperty = dragonProperty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DragonProperty getDragonProperty() {
        return dragonProperty;
    }

    public void setDragonProperty(DragonProperty dragonProperty) {
        this.dragonProperty = dragonProperty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dragon dragon = (Dragon) o;
        return Objects.equals(name, dragon.name) && Objects.equals(dragonProperty, dragon.dragonProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dragonProperty);
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", dragonProperty=" + dragonProperty +
                '}';
    }
}
