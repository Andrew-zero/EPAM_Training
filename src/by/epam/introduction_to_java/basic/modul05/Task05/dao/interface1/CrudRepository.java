package by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1;

import java.math.BigDecimal;
import java.util.List;

public interface CrudRepository<T, S> {

    long count(S s);

    T save(T entity);

    void update(T t, BigDecimal price);

    T find(T t);

    List<T> findAll();

    List<T> findAllType(S s);

    void delete(T t);

    void deleteAll();

    void deleteAllType(T t);

}
