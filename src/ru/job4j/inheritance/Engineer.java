package ru.job4j.inheritance;

public class Engineer extends Profession {

    private int solutions;

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public int getSolutions() {
        return solutions;
    }

    public void toFixProblem(int problem, boolean can) {
        this.solutions += can ? problem : 0;
    }
}
