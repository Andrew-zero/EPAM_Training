package by.epam.introduction_to_java.basic.modul05.Task05.dao;

import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05b.model.Wrap;

import java.math.BigDecimal;
import java.util.List;

public class DaoWrap implements CrudRepository<Wrap> {

    @Override
    public Wrap save(Wrap w) {
        return null;
    }

    @Override
    public void update(Wrap wrap, BigDecimal price) {

    }

    @Override
    public void delete(Wrap wrap) {

    }

    @Override
    public List<Wrap> findAll() {
        return null;
    }

    @Override
    public Wrap find(Wrap wrap, Enum e) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteAllType(Wrap wrap, Enum e) {

    }
}
