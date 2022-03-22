package by.epam.introduction_to_java.basic.modul05.Task05.bean;

import java.io.Serial;
import java.io.Serializable;

public class FlowerComposition extends AbstractFlowerComposition implements Serializable {
    @Serial
    private static final long serialVersionUID = 3403L;



    public FlowerComposition() {
    }



    @Override
    public FlowerComposition makeComposition() {
        return null;
    }
}
