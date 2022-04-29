package by.epam.introduction_to_java.basic.modul05.Task05.model.factory.bouquet;

import by.epam.introduction_to_java.basic.modul05.Task05.controller.BouquetController;
import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05.model.BasicDaoType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.BouquetFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.BouquetType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;

import java.util.List;

public class BouquetOneFactory implements BouquetFactory {
    private static BouquetFactory bouquetFactory;

    public static BouquetFactory getInstance() {
        if (bouquetFactory == null) {
            bouquetFactory = new BouquetOneFactory();
        }

        return bouquetFactory;
    }

    private BouquetOneFactory() {
    }

    @Override
    public Bouquet createBouquet(BouquetType type, BouquetController bouquetController) {
        Bouquet bouquet = new Bouquet(type);
        CrudRepository<BasicDaoType> flowerRepository = bouquetController.getDaoCommander().getDao(0);
        List<Flower> roseFlower = (List<Flower>) flowerRepository.findAllType(FlowerType.ROSE);

        for (int i = 0; i < 30; i++) {
            Flower flower = roseFlower.get(i);
            bouquet.getFlowerList().add(flower);
            bouquet.setPrice(bouquet.getPrice().add(flower.getPrice()));

            flowerRepository.delete(flower);
        }

        CrudRepository<BasicDaoType> wrapRepository = bouquetController.getDaoCommander().getDao(1);
        List<Wrap> paperWrap = (List<Wrap>) wrapRepository.findAllType(WrapType.PAPER);

        Wrap wrap = paperWrap.get(0);
        bouquet.setWrap(wrap);
        bouquet.setPrice(bouquet.getPrice().add(wrap.getPrice()));

        wrapRepository.delete(wrap);

        return bouquet;
    }
}
