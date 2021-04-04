package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        String firstName, secondName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру 11!");
        System.out.println("Введите имя первого игрока:");
        firstName = scanner.nextLine();
        System.out.println("Введите имя второго игрока:");
        secondName = scanner.nextLine();
        int matchesCount = 11;
        boolean firstPlayer = true;
        while (true) {
            if (firstPlayer) {
                System.out.println("Ход игрока " + firstName);
                firstPlayer = false;
            } else {
                System.out.println("Ход игрока " + secondName);
                firstPlayer = true;
            }
            System.out.println("Тяните спички от 1 до 3");
            int matchesLeft = Integer.valueOf(scanner.nextLine());
            if (matchesLeft < 1 || matchesLeft > 3) {
                System.out.println("Нельзя столько брать! Повторите попытку.");
                firstPlayer = !firstPlayer;
                continue;
            }
            matchesCount -= matchesLeft;
            if (matchesCount <= 0) {
                System.out.println("Спичек не осталось!");
                if (!firstPlayer) {
                    System.out.println("Победил игрок " + firstName + "!");
                } else {
                    System.out.println("Победил игрок " + secondName + "!");
                }
                break;
            }
            printMatches(matchesCount);
        }
        scanner.close();
    }

    private static void printMatches(int match) {
        System.out.println("Спичек осталось " + match);
    }
}
