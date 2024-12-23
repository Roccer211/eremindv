package tech.reliab.course.eremindv.bank.service;

public interface CrudOperations<T> {
    void create(T entity);

    T read(int id);

    void update(T entity);

    void delete(int id);
}