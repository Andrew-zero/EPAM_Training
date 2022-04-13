package by.epam.introduction_to_java.basic.modul05.Task05b.model.factory;

import by.epam.introduction_to_java.basic.modul05.Task05b.model.enum1.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05b.model.factory.interface1.Flower;

import static by.epam.introduction_to_java.basic.modul05.Task05b.model.enum1.FlowerType.ROSE;

public class RoseFactory implements Flower {
    private static RoseFactory roseFactory;

    private RoseFactory(){}

    public static RoseFactory getInstance(){
        if(roseFactory == null){
            roseFactory = new RoseFactory();
        }

        return roseFactory;
    }

    @Override
    public by.epam.introduction_to_java.basic.modul05.Task05b.model.Flower createFlower(FlowerType type) {
        return new by.epam.introduction_to_java.basic.modul05.Task05b.model.Flower(ROSE.name(), ROSE, 15);
    }
}
