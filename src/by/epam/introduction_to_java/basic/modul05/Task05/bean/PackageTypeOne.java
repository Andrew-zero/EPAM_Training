package by.epam.introduction_to_java.basic.modul05.Task05.bean;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class PackageTypeOne extends AbstractPackage implements Serializable {

    @Serial
    private static final long serialVersionUID = 43L;

    public PackageTypeOne(String name, BigDecimal price) {
        super(name, price);
    }

}
