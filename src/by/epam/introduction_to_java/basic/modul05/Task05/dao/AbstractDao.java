package by.epam.introduction_to_java.basic.modul05.Task05.dao;

import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05.resource.MockDB;
import by.epam.introduction_to_java.basic.modul05.Task05.model.BasicDaoType;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public abstract class AbstractDao implements CrudRepository<BasicDaoType> {
    public AbstractDao() {
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
    public abstract BasicDaoType save(BasicDaoType basicDaoType);

    @Override
    public void update(BasicDaoType basicDaoType, BigDecimal price) {
        Map<Long, ? extends BasicDaoType> flowerMap = MockDB.getMockMapFlower();

        flowerMap.values().stream()
                .filter(v -> v.getType().equals(basicDaoType.getType()))
                .forEach(v -> v.setPrice(price));
    }

    @Override
    public BasicDaoType find(BasicDaoType flower) {
        Map<Long, ? extends BasicDaoType> flowerMap = MockDB.getMockMapFlower();

        for (Map.Entry<Long, ? extends BasicDaoType> entry : flowerMap.entrySet()) {
            if (entry.getValue().equals(flower)) {
                return entry.getValue();
            }
        }

        return null;
    }

    @Override
    public List<? extends BasicDaoType> findAll() {
        return MockDB.getMockMapFlower().values().stream().toList();
    }

    @Override
    public List<? extends BasicDaoType> findAllEqualType(Enum e) {
        return MockDB.getMockMapFlower().values()
                .stream()
                .filter(e1 -> e1.getType().equals(e))
                .collect(Collectors.toList());
    }

    @Override
    public void delete(BasicDaoType basicDaoType) {
        Map<Long, ? extends BasicDaoType> flowerMap = MockDB.getMockMapFlower();

        for (Map.Entry<Long, ? extends BasicDaoType> entry : flowerMap.entrySet()) {
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
        Map<Long, ? extends BasicDaoType> flowerMap = MockDB.getMockMapFlower();

        for (Map.Entry<Long, ? extends BasicDaoType> entry : flowerMap.entrySet()) {
            if (entry.getValue().getType().equals(basicDaoType.getType())) {
                flowerMap.remove(entry.getKey());
            }
        }
    }
}
