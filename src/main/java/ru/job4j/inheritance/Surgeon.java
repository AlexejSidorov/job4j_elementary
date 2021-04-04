package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int knives;

    public Surgeon(String name, String surname, String education, String birthday, int knives) {
        super(name, surname, education, birthday);
        this.knives = knives;
    }

    public int getKnives() {
        return knives;
    }

    public boolean isCut(String solution) {
       return solution.equals("Need to cut");
    }
}
