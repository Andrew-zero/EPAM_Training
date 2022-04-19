package by.epam.introduction_to_java.basic.modul05.Task05.dao;

import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05.mockDB.MockDB;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Wrap;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class DaoWrap implements CrudRepository<Wrap> {

    public DaoWrap() {
    }

    @Override
    public Wrap save(Wrap w) {
        return MockDB.getMockMapWrap()
                .put(MockDB.getWrapId().incrementAndGet(), w);
    }

    @Override
    public void update(Wrap wrap, BigDecimal price) {
        Map<Long, Wrap> wrapMap = MockDB.getMockMapWrap();

        wrapMap.values().stream()
                .filter(v -> v.getType().equals(wrap.getType()))
                .forEach(v -> v.setPrice(price));
    }

    @Override
    public Wrap find(Wrap wrap) {
        Map<Long, Wrap> wrapMap = MockDB.getMockMapWrap();

        for(Map.Entry<Long, Wrap> entry : wrapMap.entrySet()){
            if(entry.getValue().equals(wrap)){
                return entry.getValue();
            }
        }

        return null;
    }

    @Override
    public List<Wrap> findAll() {
        return MockDB.getMockMapWrap().values().stream().toList();
    }

    @Override
    public void delete(Wrap wrap) {
        Map<Long, Wrap> wrapMap = MockDB.getMockMapWrap();

        for(Map.Entry<Long, Wrap> entry : wrapMap.entrySet()){
            if(entry.getValue().equals(wrap)){
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
    public void deleteAllType(Wrap wrap) {
        Map<Long, Wrap> wrapMap = MockDB.getMockMapWrap();

        for(Map.Entry<Long, Wrap> entry : wrapMap.entrySet()){
            if(entry.getValue().getType().equals(wrap.getType())){
                wrapMap.remove(entry.getKey());
            }
        }
    }
}
