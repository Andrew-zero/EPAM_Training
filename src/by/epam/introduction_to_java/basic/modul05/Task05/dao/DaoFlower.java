package by.epam.introduction_to_java.basic.modul05.Task05.dao;


import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05.mockDB.MockDB;
import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.Flower;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class DaoFlower implements CrudRepository<Flower> {

    public DaoFlower() {

    }

    @Override
    public Flower save(Flower f) {
        return MockDB.getMockMapFlower()
                .put(MockDB.getFlowerId().incrementAndGet(), f);
    }

    @Override
    public void update(Flower flower, BigDecimal price) {
        Map<Long, Flower> flowerMap = MockDB.getMockMapFlower();

        flowerMap.values().stream()
                .filter(e -> e.getType().equals(flower.getType()))
                .forEach(e -> e.setPrice(price));
    }

    @Override
    public void delete(Flower flower) {
        Map<Long, Flower> flowerMap = MockDB.getMockMapFlower();

//        flowerMap.
    }

    @Override
    public List<Flower> findAll() {
        return null;
    }

    @Override
    public Flower find(Flower flower, Enum e) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteAllType(Flower flower, Enum e) {

    }
}
