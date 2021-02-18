package ru.job4j.collection;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftSplitDot = left.split("\\.");
        String[] rightSplitDot = right.split("\\.");
        int index = Math.min(leftSplitDot.length, rightSplitDot.length);
        for (int i = 0; i < index; i++) {
            int leftPart = getInt(leftSplitDot[i]);
            int rightPart = getInt(rightSplitDot[i]);
            int rsl = Integer.compare(leftPart, rightPart);
            if (rsl != 0) {
                return rsl;
            }
        }
        return 0;
    }

    static int getInt(String string) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            return Integer.parseInt(string);
        }
        return -1;
    }
}
