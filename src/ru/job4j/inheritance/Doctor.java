package ru.job4j.inheritance;

public class Doctor extends Profession {

    private int savedMen;
    private double experience;

    public Doctor(int experience) {
        this.experience = experience;
    }

    public double getExperience() {
        return experience;
    }

    public int getSavedMen() {
        return savedMen;
    }

    public void toHeal(int sickMen) {
        savedMen += sickMen;
        experience += sickMen / 10;
    }
}
