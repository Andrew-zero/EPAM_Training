package by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1;

import java.util.List;

public interface CrudRepository<T> {
    void create(Enum type);

    void update(T t, int price);

    void delete(T t);

    List<T> findAll();

    void deleteAll();
}
