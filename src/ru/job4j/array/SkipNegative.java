package ru.job4j.array;

public class SkipNegative {

    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                if (array[i][y] < 0) {
                    array[i][y] = 0;
                }
            }
        }
        return array;
    }
}