package by.epam.introduction_to_java.basic.modul05.Task05b.model.factory;


import by.epam.introduction_to_java.basic.modul05.Task05b.exception.ModelException;
import by.epam.introduction_to_java.basic.modul05.Task05b.model.enum1.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05b.model.factory.interface1.Flower;


public class FlowerFactoryImpl implements Flower {
    public static FlowerFactoryImpl flowerFactoryImpl;

    private FlowerFactoryImpl() {
    }

    public static FlowerFactoryImpl getInstance() {
        if (flowerFactoryImpl == null) {
            flowerFactoryImpl = new FlowerFactoryImpl();
        }

        return flowerFactoryImpl;
    }

    public by.epam.introduction_to_java.basic.modul05.Task05b.model.Flower createFlower(FlowerType type) {
        by.epam.introduction_to_java.basic.modul05.Task05b.model.Flower flower;

        switch (type) {
            case ROSE -> flower = RoseFactory.getInstance().createFlower(type);
            case PEONY -> flower = PeonyFactory.getInstance().createFlower(type);
            case TULIP -> flower = TulipFactory.getInstance().createFlower(type);
            default -> throw new ModelException("Нет таких цветов");
        }

        return flower;
    }
}
