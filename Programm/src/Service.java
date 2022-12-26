package test.Service;

import java.sql.SQLException;
import java.util.List;

public interface Service<T> {

    T find(Long id) throws SQLException;
    List<T> getAll() throws SQLException;
    void save(T obj) throws SQLException;
    void update(T obj) throws SQLException;
    void delete(T obj) throws SQLException;
    List<T> getListPoId(Long id) throws SQLException;
    List<T> getListNoId() throws SQLException;
    List<T> getListPoIdPostav(Long id) throws SQLException;
}