package by.epam.introduction_to_java.basic.modul05.Task05.bean;

import java.io.Serial;
import java.io.Serializable;

public abstract class AbstractFlower implements Serializable {
    @Serial
    private static final long serialVersionUID = 243L;

    private final String name;
    private final Color color;

    public AbstractFlower(String name, Color color) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("The name cannot be empty");
        }
        this.name = name;
        if (color == null) {
            throw new IllegalArgumentException("The Color cannot be absent");
        }
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }
}
