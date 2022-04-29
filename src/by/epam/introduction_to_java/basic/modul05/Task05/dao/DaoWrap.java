package by.epam.introduction_to_java.basic.modul05.Task05.dao;

import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05.mockDB.MockDB;
import by.epam.introduction_to_java.basic.modul05.Task05.model.BasicDaoType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Wrap;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class DaoWrap implements CrudRepository<BasicDaoType> {

    public DaoWrap() {
    }

    @Override
    public long count(BasicDaoType BasicDaoType) {
        return MockDB.getMockMapWrap()
                .values()
                .stream()
                .filter(e -> e.getType().equals(BasicDaoType.getType()))
                .count();
    }

    @Override
    public Wrap save(BasicDaoType basicDaoType) {
        return MockDB.getMockMapWrap()
                .put(MockDB.getWrapId().incrementAndGet(), (Wrap) basicDaoType);
    }

    @Override
    public void update(BasicDaoType basicDaoType, BigDecimal price) {
        Map<Long, Wrap> wrapMap = MockDB.getMockMapWrap();

        wrapMap.values().stream()
                .filter(v -> v.getType().equals(basicDaoType.getType()))
                .forEach(v -> v.setPrice(price));
    }

    @Override
    public Wrap find(BasicDaoType basicDaoType) {
        Map<Long, ? extends BasicDaoType> wrapMap = MockDB.getMockMapWrap();

        for (Map.Entry<Long, ? extends BasicDaoType> entry : wrapMap.entrySet()) {
            if (entry.getValue().equals(basicDaoType)) {
                return (Wrap) entry.getValue();
            }
        }

        return null;
    }

    @Override
    public List<Wrap> findAll() {
        return  MockDB.getMockMapWrap().values().stream().toList();
    }

    @Override
    public List<Wrap> findAllType(BasicDaoType basicDaoType) {
        return MockDB.getMockMapWrap().values()
                .stream()
                .filter(e -> e.getType().equals(basicDaoType.getType()))
                .collect(Collectors.toList());
    }

    @Override
    public void delete(BasicDaoType basicDaoType) {
        Map<Long, Wrap> wrapMap = MockDB.getMockMapWrap();

        for (Map.Entry<Long, Wrap> entry : wrapMap.entrySet()) {
            if (entry.getValue().equals(basicDaoType)) {
                wrapMap.remove(entry.getKey());
                return;
            }
        }
    }

    @Override
    public void deleteAll() {
        MockDB.setMockMapWrap(new HashMap<>());
        MockDB.setWrapId(new AtomicLong(0));
    }

    @Override
    public void deleteAllType(BasicDaoType basicDaoType) {
        Map<Long, Wrap> wrapMap = MockDB.getMockMapWrap();

        for (Map.Entry<Long, Wrap> entry : wrapMap.entrySet()) {
            if (entry.getValue().getType().equals(basicDaoType.getType())) {
                wrapMap.remove(entry.getKey());
            }
        }
    }
}
