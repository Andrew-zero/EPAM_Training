package by.epam.introduction_to_java.basic.modul05.Task05b.model.factory;

import by.epam.introduction_to_java.basic.modul05.Task05b.model.enum1.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05b.model.factory.interface1.Flower;

public class TulipFactory implements Flower {
    private static TulipFactory tulipFactory;

    private TulipFactory(){}

    public static TulipFactory getInstance(){
        if(tulipFactory == null){
            tulipFactory = new TulipFactory();
        }

        return tulipFactory;
    }

    @Override
    public by.epam.introduction_to_java.basic.modul05.Task05b.model.Flower createFlower(FlowerType type) {
        return new by.epam.introduction_to_java.basic.modul05.Task05b.model.Flower(type.name(), type, 3);
    }
}
