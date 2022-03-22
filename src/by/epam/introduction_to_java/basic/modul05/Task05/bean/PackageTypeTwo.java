package by.epam.introduction_to_java.basic.modul05.Task05.bean;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class PackageTypeTwo extends AbstractPackage implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;

    public PackageTypeTwo(String name, BigDecimal price) {
        super(name, price);
    }

}
