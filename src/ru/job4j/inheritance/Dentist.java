package ru.job4j.inheritance;

public class Dentist {

    private int teeth;

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
