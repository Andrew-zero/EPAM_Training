package by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1;

import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;

import java.io.Serial;
import java.io.Serializable;

public abstract class AbstractFlowerShop implements Serializable {
    @Serial
    private static final long serialVersionUID = 443L;

    public AbstractFlowerShop() {
    }

    public abstract Bouquet createFlowerComposition();

    public int choiceFlowerComposition() {

        return 0;
    }
}
