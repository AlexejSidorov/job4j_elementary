package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int x = 2; x < number; x++) {
            if (number % x == 0) {
                return false;
            }
        }
        return prime;
    }
}
