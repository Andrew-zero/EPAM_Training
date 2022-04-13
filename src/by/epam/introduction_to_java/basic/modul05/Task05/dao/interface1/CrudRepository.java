package by.epam.introduction_to_java.basic.modul05.Task05.dao.interface1;

import java.util.Optional;

public interface CrudRepository<T, ID> {
    long count();
    void delete(T entity);
    void deleteAll();
    boolean existById(ID id);
    Iterable<T> findAll();
    Iterable<T> findAllById(Iterable<ID> ids);
    Optional<T> findById(ID id);
    <S extends T> S save(S entity);
    <S extends T> Iterable<T> saveAll(Iterable<S> entities);
}