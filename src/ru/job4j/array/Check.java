package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        for (boolean elem : data) {
            if (data[0] != elem) {
                return false;
            }
        }
        return true;
    }
}
