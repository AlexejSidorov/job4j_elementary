package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        List<Address> list = profiles.stream()
                .map(p -> p.getAddress())
                .sorted((a1, a2) -> a1.getCity().compareTo(a2.getCity()))
                .distinct()
                .collect(Collectors.toList());
        return list;
    }
}
