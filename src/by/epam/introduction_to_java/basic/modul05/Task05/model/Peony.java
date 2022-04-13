package by.epam.introduction_to_java.basic.modul05.Task05.model;

import by.epam.introduction_to_java.basic.modul05.Task05.exception.ModelException;
import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.AbstractFlower;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class Peony extends AbstractFlower implements Serializable {
    @Serial
    private static final long serialVersionUID = 2431L;

    public Peony() {
    }

    public Peony(String name){
        super(name);
    }

    public Peony(String name, BigDecimal price){
        super(name, price);
    }

    @Override
    public String toString() {
        return "Pion{" +
                "name='" + super.getName() + '\'' +
                "price=" + super.getPrice() +
                '}';
    }
}
