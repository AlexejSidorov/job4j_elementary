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
        int index = getIndex(id);
        if (index == -1) {
            return false;
        }
        mem.remove(index);
        mem.add(index, model);
        return true;
    }

    @Override
    public boolean delete(String id) {
        int index = getIndex(id);
        if (index == -1) {
            return false;
        }
        mem.remove(index);
        return true;
    }

    @Override
    public T findById(String id) {
        int index = getIndex(id);
        return index != -1 ? mem.get(index) : null;
    }

    private int getIndex(String id) {
        for (T o : mem) {
            if (o.getId().equals(id)) {
                return mem.indexOf(o);
            }
        }
        return -1;
    }
}