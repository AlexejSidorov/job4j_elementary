package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, -2, 3, -4, 5, -6, 7, -8, 9, -10);
        List<Integer> positiveList = list.stream()
                .filter(e -> e > 0)
                .collect(Collectors.toList());
        positiveList.forEach(System.out::println);
    }
}
