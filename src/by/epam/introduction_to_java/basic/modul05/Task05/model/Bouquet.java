package by.epam.introduction_to_java.basic.modul05.Task05.model;

import by.epam.introduction_to_java.basic.modul05.Task05.model.type.BouquetType;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bouquet extends BasicDaoType<BouquetType> implements Serializable {
    @Serial
    private static final long serialVersionUID = 343L;

    private Wrap wrap;
    private List<Flower> flowerList = new ArrayList<>();

    public Bouquet() {
    }

    public Bouquet(BouquetType bouquetType) {
        super(bouquetType);
    }

    public Bouquet(BouquetType type, BigDecimal price) {
        super(type, price);
    }

    public Wrap getWrap() {
        return wrap;
    }

    public void setWrap(Wrap wrap) {
        this.wrap = wrap;
    }

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bouquet bouquet = (Bouquet) o;
        return Objects.equals(getType(), bouquet.getType())
                && Objects.equals(getPrice(), bouquet.getPrice())
                && Objects.equals(wrap, bouquet.wrap)
                && Objects.equals(flowerList, bouquet.flowerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getPrice(), wrap, flowerList);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "type=" + getType() +
                ", totalPrice=" + getPrice() +
                ", wrap=" + wrap +
                ", flowerList=" + flowerList +
                '}';
    }
}
