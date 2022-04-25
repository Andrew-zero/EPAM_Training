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

public class BouquetThreeFactory implements BouquetFactory{
    private static BouquetFactory bouquetFactory;

    public static BouquetFactory getInstance(){
        if(bouquetFactory == null){
            bouquetFactory = new BouquetThreeFactory();
        }

        return bouquetFactory;
    }

    private BouquetThreeFactory(){}

    @Override
    public Bouquet createBouquet(BouquetType type) {
        Bouquet bouquet = new Bouquet();
        FlowerFactory flowerFactory = FlowerFactoryImpl.getInstance();
        WrapFactory wrapFactory = WrapFactoryImpl.getInstance();

        for (int i = 0; i < 18; i++) {
            Flower flower = flowerFactory.createFlower(FlowerType.PEONY);
            bouquet.getFlowerList().add(flower);
            bouquet.setTotalPrice(bouquet.getTotalPrice().add(flower.getPrice()));
        }

        for (int i = 0; i < 36; i++) {
            Flower flower = flowerFactory.createFlower(FlowerType.ROSE);
            bouquet.getFlowerList().add(flower);
            bouquet.setTotalPrice(bouquet.getTotalPrice().add(flower.getPrice()));
        }

        Wrap aPackage = wrapFactory.createWrap(WrapType.NYLON);
        bouquet.setWrap(aPackage);
        bouquet.setTotalPrice(bouquet.getTotalPrice().add(aPackage.getPrice()));

        return bouquet;
    }
}
