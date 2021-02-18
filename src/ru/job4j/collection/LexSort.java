package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String pat = "\\.";
        int leftInt = Integer.parseInt(left.split(pat)[0]);
        int rightInt = Integer.parseInt(right.split(pat)[0]);
        return Integer.compare(leftInt, rightInt);
    }
}
