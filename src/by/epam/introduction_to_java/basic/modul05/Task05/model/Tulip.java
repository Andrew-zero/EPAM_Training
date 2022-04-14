package by.epam.introduction_to_java.basic.modul05.Task05.model;

import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.AbstractFlower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.FlowerType;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class Tulip extends AbstractFlower implements Serializable {
    @Serial
    private static final long serialVersionUID = 2432L;

    public Tulip(FlowerType type){
        super(type);
    }

    public Tulip(FlowerType type, BigDecimal price){
        super(type, price);
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "name=" + super.getType() +
                "price=" + super.getPrice() +
                '}';
    }
}
