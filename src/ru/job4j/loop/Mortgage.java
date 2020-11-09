package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        double debt = amount * (percent + 1);
        while (debt > 0) {
            year++;
            debt -= salary;
            debt += debt * percent;
        }
        return year;
    }
}

