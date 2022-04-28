package by.epam.introduction_to_java.basic.modul05.Task05.model;

import by.epam.introduction_to_java.basic.modul05.Task05.model.type.BouquetType;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bouquet implements Serializable {
    @Serial
    private static final long serialVersionUID = 343L;

    private BouquetType type;
    private BigDecimal totalPrice = BigDecimal.ZERO;
    private Wrap wrap;
    private List<Flower> flowerList = new ArrayList<>();

    public Bouquet() {
    }

    public Bouquet(BouquetType bouquetType) {
        this.type = bouquetType;
    }

    public BouquetType getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return totalPrice;
    }

    public void setPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
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
        Bouquet that = (Bouquet) o;
        return type == that.type && Objects.equals(totalPrice, that.totalPrice) && Objects.equals(wrap, that.wrap) && Objects.equals(flowerList, that.flowerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, totalPrice, wrap, flowerList);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "bouquetType=" + type +
                ", totalPrice=" + totalPrice +
                ", wrap=" + wrap +
                ", flowerList=" + flowerList +
                '}';
    }
}
