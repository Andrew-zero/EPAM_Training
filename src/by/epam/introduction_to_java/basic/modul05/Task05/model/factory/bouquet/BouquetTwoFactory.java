package by.epam.introduction_to_java.basic.modul05.Task05.model.factory.bouquet;

import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.flower.FlowerFactoryImpl;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.wrap.WrapFactoryImpl;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.BouquetFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.FlowerFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.WrapFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.BouquetType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;

public class BouquetTwoFactory implements BouquetFactory{
    private static BouquetFactory bouquetFactory;

    public static BouquetFactory getInstance(){
        if(bouquetFactory == null){
            bouquetFactory = new BouquetTwoFactory();
        }

        return bouquetFactory;
    }

    private BouquetTwoFactory(){}

    @Override
    public Bouquet createBouquet(BouquetType type) {
        Bouquet bouquet = new Bouquet();
        FlowerFactory flowerFactory = FlowerFactoryImpl.getInstance();
        WrapFactory wrapFactory = WrapFactoryImpl.getInstance();

        for (int i = 0; i < 100; i++) {
            Flower flower = flowerFactory.createFlower(FlowerType.TULIP);
            bouquet.getFlowerList().add(flower);
            bouquet.setTotalPrice(bouquet.getTotalPrice().add(flower.getPrice()));
        }

        Wrap wrap = wrapFactory.createWrap(WrapType.CELLOPHANE);
        bouquet.setWrap(wrap);
        bouquet.setTotalPrice(bouquet.getTotalPrice().add(wrap.getPrice()));

        return bouquet;
    }
}
