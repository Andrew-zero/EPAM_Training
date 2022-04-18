package by.epam.introduction_to_java.basic.modul05.Task05.dao;

import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05b.model.Bouquet;

import java.math.BigDecimal;
import java.util.List;

public class DaoBouquet implements CrudRepository<Bouquet> {

    @Override
    public Bouquet save(Bouquet b) {
        return null;
    }

    @Override
    public void update(Bouquet bouquet, BigDecimal price) {

    }

    @Override
    public void delete(Bouquet bouquet) {

    }

    @Override
    public List<Bouquet> findAll() {
        return null;
    }

    @Override
    public Bouquet find(Bouquet bouquet, Enum e) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteAllType(Bouquet bouquet, Enum e) {

    }
}
