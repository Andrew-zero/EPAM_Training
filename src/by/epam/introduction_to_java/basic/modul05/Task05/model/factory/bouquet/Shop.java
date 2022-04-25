package by.epam.introduction_to_java.basic.modul05.Task05.model.factory.bouquet;

import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.FlowerShop;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.BouquetType;

import java.io.Serial;
import java.io.Serializable;

public class Shop implements Serializable, FlowerShop {
    @Serial
    private static final long serialVersionUID = 3403L;

    private static Shop shop;

    public static Shop getInstance() {
        if (shop == null) {
            shop = new Shop();
        }

        return shop;
    }

    private Shop() {
    }

    public Bouquet createBouquet(BouquetType type) {
        Bouquet bouquet;

        switch (type) {
            case ONE -> bouquet = BouquetOneFactory.getInstance().createBouquet(type);
            case TWO -> bouquet = BouquetTwoFactory.getInstance().createBouquet(type);
            case THREE -> bouquet = BouquetThreeFactory.getInstance().createBouquet(type);
            default -> throw new IllegalArgumentException("нет таких цветов");
        }

        return bouquet;
    }

    public Bouquet makeCompositionOne() {
        return BouquetOneFactory.getInstance().createBouquet(BouquetType.ONE);
    }

    public Bouquet makeCompositionTwo() {
        return BouquetTwoFactory.getInstance().createBouquet(BouquetType.TWO);
    }

    public Bouquet makeCompositionThree() {
        return BouquetThreeFactory.getInstance().createBouquet(BouquetType.THREE);
    }
}
