package by.epam.introduction_to_java.basic.modul05.Task05.dao;

import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05b.model.Bouquet;

import java.util.List;

public class DaoBouquet implements CrudRepository<Bouquet> {
    @Override
    public void create(Enum type) {

    }

    @Override
    public void update(Bouquet bouquet, int price) {

    }

    @Override
    public void delete(Bouquet bouquet) {

    }

    @Override
    public List<Bouquet> findAll() {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
