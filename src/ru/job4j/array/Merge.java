package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indR = 0;
        int indL = 0;
        for (int i = 0; i < rsl.length; i++) {
            if ((indR < right.length) && (indL < left.length)) {
                if (right[indR] <= left[indL]) {
                    rsl[i] = right[indR];
                    indR++;
                } else {
                    rsl[i] = left[indL];
                    indL++;
                }
            } else {
                if (indR >= right.length) {
                    rsl[i] = left[indL];
                    indL++;
                } else {
                    rsl[i] = right[indR];
                    indR++;
                }
            }
        }
        return rsl;
    }
}
