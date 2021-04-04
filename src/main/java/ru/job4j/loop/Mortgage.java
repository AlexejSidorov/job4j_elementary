package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        double debt = amount;
        while (debt > 0) {
            year++;
            debt = debt * (percent + 1);
            debt -= salary;
        }
        return year;
    }
}

