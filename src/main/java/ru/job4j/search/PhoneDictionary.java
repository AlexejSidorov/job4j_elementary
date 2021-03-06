package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> predicateName = (p) -> {
            return p.getName().equals(key);
        };
        Predicate<Person> predicateSurname = (p) -> {
            return p.getSurname().equals(key);
        };
        Predicate<Person> predicatePhone = (p) -> {
            return p.getPhone().equals(key);
        };
        Predicate<Person> predicateAddress = (p) -> {
            return p.getAddress().equals(key);
        };
        var combine = predicateName.
                or(predicateSurname).
                or(predicatePhone).
                or(predicateAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}