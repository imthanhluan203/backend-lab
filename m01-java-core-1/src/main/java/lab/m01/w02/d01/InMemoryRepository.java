package lab.m01.w02.d01;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class InMemoryRepository <T extends Identifiable<ID>,ID> implements Repository<T,ID>{
    private HashMap<ID,T> myRepo = new HashMap<>();

    @Override
    public void save(T entity) {
        myRepo.put(entity.getId(),entity);
    }

    @Override
    public Optional<T> findByID(ID id) {
        return Optional.empty();
    }

    @Override
    public List<T> findAll() {
        return List.copyOf(myRepo.values());
    }

    public HashMap<ID, T> getMyRepo() {
        return myRepo;
    }

    public void setMyRepo(HashMap<ID, T> myRepo) {
        this.myRepo = myRepo;
    }
}
