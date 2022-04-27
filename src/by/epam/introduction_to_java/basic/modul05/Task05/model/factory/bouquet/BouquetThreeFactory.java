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
import java.util.stream.Collectors;

public class BouquetThreeFactory implements BouquetFactory {
    private static BouquetFactory bouquetFactory;

    public static BouquetFactory getInstance() {
        if (bouquetFactory == null) {
            bouquetFactory = new BouquetThreeFactory();
        }

        return bouquetFactory;
    }

    private BouquetThreeFactory() {
    }

    @Override
    public Bouquet createBouquet(BouquetType type, BouquetController bouquetController) {
        Bouquet bouquet = new Bouquet(type);
        CrudRepository<Flower> flowerRepository = (CrudRepository<Flower>) bouquetController.getDaoCommander().getDao(0);
        List<Flower> peonyFlower = flowerRepository.findAll()
                .stream()
                .filter(e -> e.getType().equals(FlowerType.PEONY))
                .collect(Collectors.toList());

        List<Flower> roseFlower = flowerRepository.findAll()
                .stream()
                .filter(e -> e.getType().equals(FlowerType.ROSE))
                .collect(Collectors.toList());

        for (int i = 0; i < 18; i++) {
            Flower flower = peonyFlower.get(i);
            bouquet.getFlowerList().add(flower);
            bouquet.setTotalPrice(bouquet.getTotalPrice().add(flower.getPrice()));

            flowerRepository.delete(flower);
        }

        for (int i = 0; i < 36; i++) {
            Flower flower = roseFlower.get(i);
            bouquet.getFlowerList().add(flower);
            bouquet.setTotalPrice(bouquet.getTotalPrice().add(flower.getPrice()));

            flowerRepository.delete(flower);
        }

        CrudRepository<Wrap> wrapRepository = (CrudRepository<Wrap>) bouquetController.getDaoCommander().getDao(1);
        List<Wrap> paperWrap = wrapRepository.findAll()
                .stream()
                .filter(e -> e.getType().equals(WrapType.NYLON))
                .collect(Collectors.toList());

        Wrap wrap = paperWrap.get(0);
        bouquet.setWrap(wrap);
        bouquet.setTotalPrice(bouquet.getTotalPrice().add(wrap.getPrice()));

        wrapRepository.delete(wrap);

        return bouquet;
    }
}
