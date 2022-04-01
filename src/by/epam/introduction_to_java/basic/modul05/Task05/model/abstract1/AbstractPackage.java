package by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1;

import by.epam.introduction_to_java.basic.modul05.Task05.exception.ModelException;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Package;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public abstract class AbstractPackage implements Serializable, Package {
    @Serial
    private static final long serialVersionUID = 143L;

    private String name;
    private BigDecimal price;

    public AbstractPackage() {
    }

    public AbstractPackage(String name) {
        try {
            if (name.isEmpty()) {
                throw new ModelException("The name Package cannot be empty");
            }
        }catch (ModelException e){
            e.printStackTrace();
            return;
        }
        this.name = name;
    }

    public AbstractPackage(String name, BigDecimal price) {
        try {
            if (name.isEmpty()) {
                throw new ModelException("The name Package cannot be empty");
            }
        }catch (ModelException e){
            e.printStackTrace();
            return;
        }
        this.name = name;

        try {
            if (price.doubleValue() < 0) {
                throw new ModelException("The price Package cannot be low then '0'");
            }
        }catch (ModelException e){
            e.printStackTrace();
            return;
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public abstract void packagingFlower();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPackage that = (AbstractPackage) o;
        return Objects.equals(name, that.name) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Package{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
