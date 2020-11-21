package ru.job4j.inheritance;

public class Doctor extends Profession {

    private int savedMen;
    private double experience;

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
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
