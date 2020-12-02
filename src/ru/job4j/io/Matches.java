package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру 11");
        boolean run = true;
        int matchesCount = 11;
        while (run) {
            System.out.println("Тяните спички от 1 до 3");
            int matchesLeft = Integer.valueOf(scanner.nextLine());
            if (matchesLeft < 1 || matchesLeft > 3) {
                System.out.println("Нельзя столько брать! Тяните снова.");
                continue;
            }
            matchesCount -= matchesLeft;
            printMatches(matchesCount);
            if (matchesCount <= 0) {
                run = false;
            }
        }
        scanner.close();
    }

    private static void printMatches(int match) {
        if (match <= 0) {
            System.out.println("Спичек не осталось, вы выиграли!");
        } else {
            System.out.println("Спичек осталось " + match);
        }
    }
}
