package by.epam.introduction_to_java.basic.modul05.Task05.dao;

import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05b.model.Wrap;

import java.util.List;

public class DaoWrap implements CrudRepository<Wrap> {
    @Override
    public void create(Enum type) {

    }

    @Override
    public void update(Wrap wrap, int price) {

    }

    @Override
    public void delete(Wrap wrap) {

    }

    @Override
    public List<Wrap> findAll() {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
