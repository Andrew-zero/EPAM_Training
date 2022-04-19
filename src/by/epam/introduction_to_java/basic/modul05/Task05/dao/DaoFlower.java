package by.epam.introduction_to_java.basic.modul05.Task05.dao;


import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05.mockDB.MockDB;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Flower;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

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
                .filter(v -> v.getType().equals(flower.getType()))
                .forEach(v -> v.setPrice(price));
    }

    @Override
    public Flower find(Flower flower) {
        Map<Long, Flower> flowerMap = MockDB.getMockMapFlower();

        for (Map.Entry<Long, Flower> entry : flowerMap.entrySet()) {
            if (entry.getValue().equals(flower)) {
                return entry.getValue();
            }
        }

        return null;
    }

    @Override
    public List<Flower> findAll() {
        return MockDB.getMockMapFlower().values().stream().toList();
    }

    @Override
    public void delete(Flower flower) {
        Map<Long, Flower> flowerMap = MockDB.getMockMapFlower();

        for (Map.Entry<Long, Flower> entry : flowerMap.entrySet()) {
            if (entry.getValue().equals(flower)) {
                flowerMap.remove(entry.getKey());
                return;
            }
        }
    }

    @Override
    public void deleteAll() {
        MockDB.setMockMapFlower(new HashMap<>());
        MockDB.setFlowerId(new AtomicLong(0));
    }

    @Override
    public void deleteAllType(Flower flower) {
        Map<Long, Flower> flowerMap = MockDB.getMockMapFlower();

        for (Map.Entry<Long, Flower> entry : flowerMap.entrySet()) {
            if (entry.getValue().getType().equals(flower.getType())) {
                flowerMap.remove(entry.getKey());
            }
        }
    }
}
