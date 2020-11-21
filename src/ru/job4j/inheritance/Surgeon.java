package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int knives;

    public Surgeon(int knives) {
        this.knives = knives;
    }

    public int getKnives() {
        return knives;
    }

    public boolean isCut(String solution) {
       return solution.equals("Need to cut");
    }
}
