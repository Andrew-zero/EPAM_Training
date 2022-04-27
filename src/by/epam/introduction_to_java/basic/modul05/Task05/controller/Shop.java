package by.epam.introduction_to_java.basic.modul05.Task05.controller;

import by.epam.introduction_to_java.basic.modul05.Task05.controller.interface1.FlowerShop;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.bouquet.BouquetOneFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.bouquet.BouquetThreeFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.bouquet.BouquetTwoFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.BouquetType;

import java.io.Serial;
import java.io.Serializable;

public class Shop implements Serializable, FlowerShop {
    @Serial
    private static final long serialVersionUID = 3403L;

    private BouquetController bouquetController;

    public Shop() {
    }

    public BouquetController getBouquetController() {
        return bouquetController;
    }

    public void setBouquetController(BouquetController bouquetController) {
        this.bouquetController = bouquetController;
    }

    public Bouquet makeCompositionOne() {
        return BouquetOneFactory.getInstance().createBouquet(BouquetType.ONE, bouquetController);
    }

    public Bouquet makeCompositionTwo() {
        return BouquetTwoFactory.getInstance().createBouquet(BouquetType.TWO, bouquetController);
    }

    public Bouquet makeCompositionThree() {
        return BouquetThreeFactory.getInstance().createBouquet(BouquetType.THREE, bouquetController);
    }
}
