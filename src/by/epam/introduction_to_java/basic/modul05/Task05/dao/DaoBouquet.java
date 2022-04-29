package by.epam.introduction_to_java.basic.modul05.Task05.dao;

import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05.mockDB.MockDB;
import by.epam.introduction_to_java.basic.modul05.Task05.model.BasicDaoType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class DaoBouquet implements CrudRepository<BasicDaoType> {

    public DaoBouquet() {
    }

    @Override
    public long count(Bouquet bouquet) {
        return MockDB.getMockMapBouquet()
                .values()
                .stream()
                .filter(e -> e.getType().equals(bouquet.getType()))
                .count();
    }

    @Override
    public Bouquet save(Bouquet b) {
        return MockDB.getMockMapBouquet()
                .put(MockDB.getBouquetId().incrementAndGet(), b);
    }

    @Override
    public void update(Bouquet bouquet, BigDecimal price) {
        Map<Long, Bouquet> bouquetMap = MockDB.getMockMapBouquet();

        bouquetMap.values().stream()
                .filter(v -> v.getType().equals(bouquet.getType()))
                .forEach(v -> v.setPrice(price));
    }

    @Override
    public Bouquet find(Bouquet bouquet) {
        Map<Long, Bouquet> bouquetMap = MockDB.getMockMapBouquet();

        for (Map.Entry<Long, Bouquet> entry : bouquetMap.entrySet()) {
            if (entry.getValue().equals(bouquet)) {
                return entry.getValue();
            }
        }

        return null;
    }

    @Override
    public List<Bouquet> findAll() {
        return MockDB.getMockMapBouquet().values().stream().toList();
    }

    @Override
    public List<Bouquet> findAllType(Bouquet bouquet) {
        return MockDB.getMockMapBouquet().values()
                .stream()
                .filter(e -> e.getType().equals(bouquet.getType()))
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Bouquet bouquet) {
        Map<Long, Bouquet> bouquetMap = MockDB.getMockMapBouquet();

        for (Map.Entry<Long, Bouquet> entry : bouquetMap.entrySet()) {
            if (entry.getValue().equals(bouquet)) {
                bouquetMap.remove(entry.getKey());
                return;
            }
        }
    }

    @Override
    public void deleteAll() {
        MockDB.setMockMapBouquet(new HashMap<>());
        MockDB.setBouquetId(new AtomicLong(0));
    }

    @Override
    public void deleteAllType(Bouquet bouquet) {
        Map<Long, Bouquet> bouquetMap = MockDB.getMockMapBouquet();

        for (Map.Entry<Long, Bouquet> entry : bouquetMap.entrySet()) {
            if (entry.getValue().getType().equals(bouquet.getType())) {
                bouquetMap.remove(entry.getKey());
            }
        }
    }
}
