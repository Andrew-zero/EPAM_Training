package by.epam.introduction_to_java.basic.modul05.Task05.dao;

import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;

import java.util.HashMap;
import java.util.Map;

public class DaoCommander {
    Map<Integer, CrudRepository> hashMap = new HashMap<>();

    public DaoCommander() {
        hashMap.put(0, new DaoFlower());
        hashMap.put(1, new DaoWrap());
        hashMap.put(2, new DaoBouquet());
    }

    public Map<Integer, CrudRepository> getDao() {
        return hashMap;
    }
}
