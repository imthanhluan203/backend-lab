package lab.m01.w02.d01;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface Repository <T, ID>{
    void save(T entity);
    Optional<T> findByID(ID id);
    List<T> findAll();
}
