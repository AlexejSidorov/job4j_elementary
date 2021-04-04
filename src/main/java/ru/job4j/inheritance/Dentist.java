package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private int teeth;

    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public int getTeeth() {
        return teeth;
    }

    public void tellMeA() {
        System.out.println("Tell me AAAA.");
    }

    public void dropTeeth(int teeth) {
        this.teeth += teeth;
    }
}
