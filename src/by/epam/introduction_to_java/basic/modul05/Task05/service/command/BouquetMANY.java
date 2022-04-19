package by.epam.introduction_to_java.basic.modul05.Task05.service.command;

import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.flower.FlowerFactoryImpl;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.wrap.WrapFactoryImpl;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.FlowerFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.WrapFactory;

import java.io.Serial;
import java.io.Serializable;

public class BouquetMANY extends Bouquet implements Serializable {
    @Serial
    private static final long serialVersionUID = 3403L;

    public BouquetMANY() {
    }

//    public BouquetMANY(String name) {
//        super(name);
//    }

    public BouquetMANY makeCompositionOne() {
        FlowerFactory flowerFactory = FlowerFactoryImpl.getInstance();
        WrapFactory wrapFactory = WrapFactoryImpl.getInstance();

        for (int i = 0; i < 30; i++) {
            Flower flower = flowerFactory.createFlower(FlowerType.ROSE);
            getFlowerList().add(flower);
            setTotalPrice(getTotalPrice().add(flower.getPrice()));
        }

        Wrap wrap = wrapFactory.createWrap(WrapType.PAPER);
        System.out.println(wrap);
        this.setWrap(wrap);
        this.setTotalPrice(getTotalPrice().add(wrap.getPrice()));

        return this;
    }

    public BouquetMANY makeCompositionTwo() {
        FlowerFactory flowerFactory = FlowerFactoryImpl.getInstance();
        WrapFactory wrapFactory = WrapFactoryImpl.getInstance();

        for (int i = 0; i < 100; i++) {
            Flower flower = flowerFactory.createFlower(FlowerType.TULIP);
            getFlowerList().add(flower);
            setTotalPrice(getTotalPrice().add(flower.getPrice()));
        }

        Wrap wrap = wrapFactory.createWrap(WrapType.CELLOPHANE);
        setWrap(wrap);
        setTotalPrice(getTotalPrice().add(wrap.getPrice()));

        return this;
    }

    public BouquetMANY makeCompositionThree() {
        FlowerFactory flowerFactory = FlowerFactoryImpl.getInstance();
        WrapFactory wrapFactory = WrapFactoryImpl.getInstance();

        for (int i = 0; i < 18; i++) {
            Flower flower = flowerFactory.createFlower(FlowerType.PEONY);
            getFlowerList().add(flower);
            setTotalPrice(getTotalPrice().add(flower.getPrice()));
        }

        for (int i = 0; i < 36; i++) {
            Flower flower = flowerFactory.createFlower(FlowerType.ROSE);
            getFlowerList().add(flower);
            setTotalPrice(getTotalPrice().add(flower.getPrice()));
        }

        Wrap aPackage = wrapFactory.createWrap(WrapType.NYLON);
        setWrap(aPackage);
        setTotalPrice(getTotalPrice().add(aPackage.getPrice()));

        return this;
    }

    @Override
    public String toString() {
        return "FlowerComposition{" +
//                "name='" + super.getName() + '\'' +
                ", totalPrice=" + super.getTotalPrice() +
                ", aPackage=" + super.getWrap() +
                ", flowerList=" + super.getFlowerList() +
                '}';
    }
}
