package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String o1Part = getFirstPart(o1);
        String o2Part = getFirstPart(o2);
        if (o1Part.equals(o2Part)) {
            return o1.compareTo(o2);
        }
        return o2.compareTo(o1);
    }

    private String getFirstPart(String o) {
        return o.split("/")[0];
    }
}