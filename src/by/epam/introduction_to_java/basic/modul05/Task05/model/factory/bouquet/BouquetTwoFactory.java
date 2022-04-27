package by.epam.introduction_to_java.basic.modul05.Task05.model.factory.bouquet;

import by.epam.introduction_to_java.basic.modul05.Task05.controller.BouquetController;
import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.BouquetFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.BouquetType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;

import java.util.List;

public class BouquetTwoFactory implements BouquetFactory {
    private static BouquetFactory bouquetFactory;

    public static BouquetFactory getInstance() {
        if (bouquetFactory == null) {
            bouquetFactory = new BouquetTwoFactory();
        }

        return bouquetFactory;
    }

    private BouquetTwoFactory() {
    }

    @Override
    public Bouquet createBouquet(BouquetType type, BouquetController bouquetController) {
        Bouquet bouquet = new Bouquet(type);
        CrudRepository<Flower, FlowerType> flowerRepository = bouquetController.getDaoCommander().getDao(0);
        List<Flower> tulipFlower = flowerRepository.findAllType(FlowerType.TULIP);

        for (int i = 0; i < 100; i++) {
            Flower flower = tulipFlower.get(i);
            bouquet.getFlowerList().add(flower);
            bouquet.setTotalPrice(bouquet.getTotalPrice().add(flower.getPrice()));

            flowerRepository.delete(flower);
        }

        CrudRepository<Wrap, WrapType> wrapRepository = bouquetController.getDaoCommander().getDao(1);
        List<Wrap> paperWrap = wrapRepository.findAllType(WrapType.CELLOPHANE);

        Wrap wrap = paperWrap.get(0);
        bouquet.setWrap(wrap);
        bouquet.setTotalPrice(bouquet.getTotalPrice().add(wrap.getPrice()));

        wrapRepository.delete(wrap);

        return bouquet;
    }
}
