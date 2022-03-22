package by.epam.introduction_to_java.basic.modul05.Task05.bean;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class AbstractFlowerComposition extends ArrayList<AbstractFlower> implements Serializable{
    @Serial
    private static final long serialVersionUID = 343L;

    private Bouquet name;
    private BigDecimal totalPrice;




    public abstract FlowerComposition makeComposition();


}
