package by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1;

import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.FlowerComposition;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Package;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class AbstractFlowerComposition implements Serializable, FlowerComposition {
    @Serial
    private static final long serialVersionUID = 343L;

    private String name;
    private BigDecimal totalPrice = BigDecimal.ZERO;
    private Package aPackage;
    private List<Flower> flowerList = new ArrayList<>();

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

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public abstract FlowerComposition makeComposition();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractFlowerComposition that = (AbstractFlowerComposition) o;
        return Objects.equals(name, that.name) && Objects.equals(totalPrice, that.totalPrice) && Objects.equals(aPackage, that.aPackage) && Objects.equals(flowerList, that.flowerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalPrice, aPackage, flowerList);
    }

    @Override
    public String toString() {
        return "AbstractFlowerComposition{" +
                "name='" + name + '\'' +
                ", totalPrice=" + totalPrice +
                ", aPackage=" + aPackage +
                ", flowerList=" + flowerList +
                '}';
    }
}
