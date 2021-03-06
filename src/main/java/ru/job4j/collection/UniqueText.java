package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String originWord : origin) {
            check.add(originWord);
        }
        for (String textWord : text) {
            if (!check.contains(textWord)) {
                return false;
            }
        }
        return rsl;
    }
}