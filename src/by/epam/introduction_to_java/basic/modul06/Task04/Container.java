package by.epam.introduction_to_java.basic.modul06.Task04;

import java.util.Objects;

public class Container {

    private int id;
    private int weight; // weight in ton;

    public Container(){}

    public Container(int id, int weight){
        this.id = id;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Container container = (Container) o;
        return id == container.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Container{" +
                "id=" + id +
                '}';
    }
}
