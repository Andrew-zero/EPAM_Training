package by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1;

import java.util.List;

public interface CrudRepository<T> {

    <S extends T> S save(S entity);

    void update(T t, int price);

    List<T> findAll();

    T find(T t, Enum e);

    void deleteAll();

    void delete(T t);
}
