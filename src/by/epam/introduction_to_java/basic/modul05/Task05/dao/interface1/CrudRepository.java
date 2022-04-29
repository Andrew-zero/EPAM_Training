package by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1;

import java.math.BigDecimal;
import java.util.List;

public interface CrudRepository<T> {

    long count(T t);

    ? extends T save(T entity);

    void update(T t, BigDecimal price);

    ? extends T find(T t);

    List<? extends T> findAll();

    List<? extends T> findAllType(T t);

    void delete(T t);

    void deleteAll();

    void deleteAllType(T t);

}
