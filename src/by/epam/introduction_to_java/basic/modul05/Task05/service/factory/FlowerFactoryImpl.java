package by.epam.introduction_to_java.basic.modul05.Task05.service.factory;

import by.epam.introduction_to_java.basic.modul05.Task05.entity.enam.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.entity.interface1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.service.interface1.FlowerFactory;

public class FlowerFactoryImpl implements FlowerFactory {
    private static FlowerFactoryImpl flowerFactory;

    public static FlowerFactoryImpl getInstance() {
        if (flowerFactory == null) {
            flowerFactory = new FlowerFactoryImpl();
        }

        return flowerFactory;
    }

    private FlowerFactoryImpl() {
    }

    public Flower createFlower(FlowerType type) {
        Flower flower;

        switch (type) {
            case PION -> flower = PionFactory.getInstance().createFlower(type);
            case ROSE -> flower = RoseFactory.getInstance().createFlower(type);
            case TULIP -> flower = TulipFactory.getInstance().createFlower(type);
            default -> throw new IllegalArgumentException("нет таких цветов");
        }

        return flower;
    }
}
