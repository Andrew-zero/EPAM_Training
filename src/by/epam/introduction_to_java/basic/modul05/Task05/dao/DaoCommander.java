package by.epam.introduction_to_java.basic.modul05.Task05.dao;

import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05.model.BasicDaoType;

import java.util.HashMap;
import java.util.Map;

//0 - DaoFlower
//1 - DaoWrap
//2 - DaoBouquet

public class DaoCommander {
    private Map<Integer, CrudRepository<BasicDaoType>> hashMap = new HashMap<>();

    public DaoCommander() {
        hashMap.put(0, new DaoFlower());
        hashMap.put(1, new DaoWrap());
        hashMap.put(2, new DaoBouquet());
    }

    public CrudRepository<BasicDaoType> getDao(int i) {
        return hashMap.get(i);
    }
}
