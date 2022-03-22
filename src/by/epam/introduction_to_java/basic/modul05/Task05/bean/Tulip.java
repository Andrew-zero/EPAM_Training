package by.epam.introduction_to_java.basic.modul05.Task05.bean;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class Tulip extends AbstractFlower implements Serializable {
    @Serial
    private static final long serialVersionUID = 2432L;

    private BigDecimal price;

    public Tulip(String name, Color color) {
        super(name, color);
    }

    public Tulip(String name, Color color, BigDecimal price) {
        super(name, color);
        if (price.doubleValue() < 0) {
            throw new IllegalArgumentException("The price cannot be low then '0'");
        }
        this.price = price;
    }
}
