package by.epam.introduction_to_java.basic.modul05.Task05.dao;


import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.Flower;

import java.util.List;

public class DaoFlower implements CrudRepository<Flower> {

    @Override
    public Flower save(Flower f) {
        return null;
    }

    @Override
    public void update(Flower flower, int price) {

    }

    @Override
    public void delete(Flower flower) {

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
}
