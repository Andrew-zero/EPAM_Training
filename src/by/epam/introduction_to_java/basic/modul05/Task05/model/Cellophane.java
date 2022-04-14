package by.epam.introduction_to_java.basic.modul05.Task05.model;

import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class Cellophane extends Wrap implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;

    public Cellophane(){}

    public Cellophane(WrapType type) {
        super(type);
    }

    public Cellophane(WrapType type, BigDecimal price){
        super(type, price);
    }

    @Override
    public String toString() {
        return "PackageTypeTwo{" +
                "name=" + super.getType() +
                "price=" + super.getPrice() +
                '}';
    }
}
