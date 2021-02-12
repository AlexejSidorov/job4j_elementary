package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        if (persons.isEmpty() || key == null) {
            return result;
        }
        for (Person person : persons) {
            if (isCoincidence(person, key)) {
                result.add(person);
            }
        }
        return result;
    }

    private boolean isCoincidence(Person person, String key) {
        String name = person.getName();
        String surname = person.getSurname();
        String address = person.getAddress();
        String phone = person.getPhone();
        return name.contains(key)
                || surname.contains(key)
                || address.contains(key)
                || phone.contains(key);
    }
}
