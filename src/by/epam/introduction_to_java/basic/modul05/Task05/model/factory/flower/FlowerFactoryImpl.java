package by.epam.introduction_to_java.basic.modul05.Task05.model.factory.flower;

import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.FlowerFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.FlowerType;

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
            case PEONY -> flower = PeonyFactory.getInstance().createFlower(type);
            case ROSE -> flower = RoseFactory.getInstance().createFlower(type);
            case TULIP -> flower = TulipFactory.getInstance().createFlower(type);
            default -> throw new IllegalArgumentException("нет таких цветов");
        }

        return flower;
    }
}
