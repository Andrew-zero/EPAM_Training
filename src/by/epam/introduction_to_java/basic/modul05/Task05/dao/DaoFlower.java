package by.epam.introduction_to_java.basic.modul05.Task05.dao;


import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05.mockDB.MockDB;
import by.epam.introduction_to_java.basic.modul05.Task05.model.BasicDaoType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Flower;

public class DaoFlower extends AbstractDao implements CrudRepository<BasicDaoType> {

    public DaoFlower() {
    }

    @Override
    public Flower save(BasicDaoType basicDaoType) {
        return MockDB.getMockMapFlower()
                .put(MockDB.getFlowerId().incrementAndGet(), (Flower) basicDaoType);
    }
}
