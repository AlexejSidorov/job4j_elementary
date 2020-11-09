package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int x = 2; x < number; x++) {
            if (number % x == 0) {
                return false;
            }
        }
        return prime;
    }
}
