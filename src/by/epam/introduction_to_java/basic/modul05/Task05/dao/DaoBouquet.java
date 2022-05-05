package by.epam.introduction_to_java.basic.modul05.Task05.dao;

import by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1.CrudRepository;
import by.epam.introduction_to_java.basic.modul05.Task05.resource.MockDB;
import by.epam.introduction_to_java.basic.modul05.Task05.model.BasicDaoType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;

public class DaoBouquet extends AbstractDao implements CrudRepository<BasicDaoType> {

    public DaoBouquet() {
    }

    @Override
    public Bouquet save(BasicDaoType basicDaoType) {
        return MockDB.getMockMapBouquet()
                .put(MockDB.getBouquetId().incrementAndGet(), (Bouquet) basicDaoType);
    }
}
