package ru.job4j.generic;

import java.util.ArrayList;
import java.util.List;

public final class MemStore<T extends Base> implements Store<T> {

    private final List<T> mem = new ArrayList<>();

    @Override
    public void add(T model) {
        mem.add(model);
    }

    @Override
    public boolean replace(String id, T model) {
        if (delete(id)) {
            add(model);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        T o = findById(id);
        return o != null && mem.remove(o);
    }

    @Override
    public T findById(String id) {
        return mem.stream()
                .takeWhile(o -> o.getId().equals(id))
                .findFirst().orElse(null);
    }
}