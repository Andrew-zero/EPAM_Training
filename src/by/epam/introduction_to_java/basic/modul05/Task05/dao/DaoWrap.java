package by.epam.introduction_to_java.basic.modul05.Task05.dao;

import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05.mockDB.MockDB;
import by.epam.introduction_to_java.basic.modul05.Task05.model.BasicDaoType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Wrap;

public class DaoWrap extends AbstractDao implements CrudRepository<BasicDaoType> {

    public DaoWrap() {
    }

    @Override
    public Wrap save(BasicDaoType basicDaoType) {
        return MockDB.getMockMapWrap()
                .put(MockDB.getWrapId().incrementAndGet(), (Wrap) basicDaoType);
    }
}
