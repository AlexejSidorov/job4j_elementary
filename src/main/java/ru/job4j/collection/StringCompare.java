package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int leftLn = left.length();
        int rightLn = right.length();
        int index = Math.min(leftLn, rightLn);
        for (int i = 0; i < index; i++) {
            int rsl = Integer.compare(left.charAt(i), right.charAt(i));
            if (rsl != 0) {
                return rsl;
            }
        }
        return Integer.compare(leftLn, rightLn);
    }
}
