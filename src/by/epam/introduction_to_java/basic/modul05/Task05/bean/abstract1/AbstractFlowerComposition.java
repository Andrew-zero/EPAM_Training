package by.epam.introduction_to_java.basic.modul05.Task05.bean.abstract1;

import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.FlowerComposition;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.Package;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;

public abstract class AbstractFlowerComposition extends ArrayList<Flower> implements Serializable, FlowerComposition {
    @Serial
    private static final long serialVersionUID = 343L;

    private String name;
    private BigDecimal totalPrice = BigDecimal.ZERO;
    private Package aPackage;

    public AbstractFlowerComposition() {
    }

    public AbstractFlowerComposition(String name) {
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

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    public abstract FlowerComposition makeComposition();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AbstractFlowerComposition flowers = (AbstractFlowerComposition) o;
        return Objects.equals(name, flowers.name) && Objects.equals(totalPrice, flowers.totalPrice) && Objects.equals(aPackage, flowers.aPackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, totalPrice, aPackage);
    }

    @Override
    public String toString() {
        return "FlowerComposition{" +
                "name=" + name +
                ", totalPrice=" + totalPrice +
                ", package=" + aPackage +
                ", flower=" + this +
                '}';
    }
}
