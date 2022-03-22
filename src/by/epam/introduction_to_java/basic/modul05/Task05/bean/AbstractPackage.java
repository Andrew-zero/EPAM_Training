package by.epam.introduction_to_java.basic.modul05.Task05.bean;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public abstract class AbstractPackage implements Serializable {
    @Serial
    private static final long serialVersionUID = 143L;

    private String name;
    private BigDecimal price;

    public AbstractPackage(){}

    public AbstractPackage(String name, BigDecimal price) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("The name cannot be empty");
        }
        this.name = name;
        if (price.doubleValue() < 0) {
            throw new IllegalArgumentException("The price cannot be low then '0'");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
