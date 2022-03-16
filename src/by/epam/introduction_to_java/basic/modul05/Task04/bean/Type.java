package by.epam.introduction_to_java.basic.modul05.Task04.bean;

import java.io.Serializable;

public enum Type{

    JEWEL("Драгоценный камень"),
    ORE("Драгоценный металл"),
    ARTWORK("Произведение искусства");

    public String name;

    Type(){
    }

    Type(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Type{" +
                "name='" + name + '\'' +
                '}';
    }
}
