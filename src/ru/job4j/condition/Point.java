package ru.job4j.condition;

import java.lang.Math;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double xQuad = Math.pow((x2 - x1), 2);
        double yQuad = Math.pow((y2 - y1), 2);
        double rsl = Math.sqrt(xQuad + yQuad);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(4, 3, 5, 5);
        System.out.println("result (4, 3) to (5, 5) " + result);
        result = Point.distance(5, 2, 5, 7);
        System.out.println("result (5, 2) to (5, 7) " + result);
    }
}
