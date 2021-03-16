package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        List<Address> list = profiles.stream()
                .map(p -> p.getAddress())
                .collect(Collectors.toList());
        return list;
    }
}
