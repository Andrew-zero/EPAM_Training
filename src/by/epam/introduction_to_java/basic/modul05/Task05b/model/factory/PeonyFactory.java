package by.epam.introduction_to_java.basic.modul05.Task05b.model.factory;

import by.epam.introduction_to_java.basic.modul05.Task05b.model.enum1.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05b.model.factory.interface1.Flower;

public class PeonyFactory implements Flower {
    private static PeonyFactory peonyFactory;

    private PeonyFactory(){}

    public static PeonyFactory getInstance(){
        if(peonyFactory == null){
            peonyFactory = new PeonyFactory();
        }

        return peonyFactory;
    }

    @Override
    public by.epam.introduction_to_java.basic.modul05.Task05b.model.Flower createFlower(FlowerType type) {
        return new by.epam.introduction_to_java.basic.modul05.Task05b.model.Flower(type.name(), type, 10);
    }
}
