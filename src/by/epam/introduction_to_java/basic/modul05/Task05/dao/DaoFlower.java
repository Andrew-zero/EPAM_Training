package by.epam.introduction_to_java.basic.modul05.Task05.dao;


import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05.mockDB.MockDB;
import by.epam.introduction_to_java.basic.modul05.Task05.model.BasicDaoType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Flower;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class DaoFlower implements CrudRepository<BasicDaoType> {

    public DaoFlower() {
    }

    @Override
    public long count(BasicDaoType basicDaoType) {
        return MockDB.getMockMapFlower()
                .values()
                .stream()
                .filter(f -> f.getType().equals(basicDaoType.getType()))
                .count();
    }

    @Override
    public Flower save(BasicDaoType basicDaoType) {
        return MockDB.getMockMapFlower()
                .put(MockDB.getFlowerId().incrementAndGet(), (Flower)basicDaoType);
    }

    @Override
    public void update(BasicDaoType basicDaoType, BigDecimal price) {
        Map<Long, Flower> flowerMap = MockDB.getMockMapFlower();

        flowerMap.values().stream()
                .filter(v -> v.getType().equals(basicDaoType.getType()))
                .forEach(v -> v.setPrice(price));
    }

    @Override
    public Flower find(BasicDaoType flower) {
        Map<Long,? extends BasicDaoType> flowerMap = MockDB.getMockMapFlower();

        for (Map.Entry<Long,? extends BasicDaoType> entry : flowerMap.entrySet()) {
            if (entry.getValue().equals(flower)) {
                return (Flower)entry.getValue();
            }
        }

        return null;
    }

    @Override
    public List<Flower> findAll() {
        return MockDB.getMockMapFlower().values().stream().toList();
    }

    @Override
    public List<Flower> findAllType(BasicDaoType basicDaoType) {
        return MockDB.getMockMapFlower().values()
                .stream()
                .filter(e -> e.getType().equals(basicDaoType.getType()))
                .collect(Collectors.toList());
    }

    @Override
    public void delete(BasicDaoType basicDaoType) {
        Map<Long, Flower> flowerMap = MockDB.getMockMapFlower();

//        for (Map.Entry<Long, Flower> entry : flowerMap.entrySet()) {
            if (entry.getValue().equals(basicDaoType)) {
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
    public void deleteAllType(BasicDaoType basicDaoType) {
        Map<Long, Flower> flowerMap = MockDB.getMockMapFlower();

        for (Map.Entry<Long, Flower> entry : flowerMap.entrySet()) {
            if (entry.getValue().getType().equals(basicDaoType.getType())) {
                flowerMap.remove(entry.getKey());
            }
        }
    }
}
