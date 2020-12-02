package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? " + System.lineSeparator());
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
                print("Да");
                break;
            case 1:
                print("Нет");
                break;
            default:
                print("Может быть");
                break;
        }
    }

    private static void print(String msg) {
        System.out.println(msg);
    }
}
