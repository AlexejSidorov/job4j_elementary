package ru.job4j.generic;

public class RoleStore implements Store<Role> {

    private final MemStore<Role> store = new MemStore<>();

    @Override
    public void add(Role model) {
        store.add(model);
    }

    @Override
    public boolean replace(String character, Role model) {
        return store.replace(character, model);
    }

    @Override
    public boolean delete(String character) {
        return store.delete(character);
    }

    @Override
    public Role findById(String character) {
        return store.findById(character);
    }
}
