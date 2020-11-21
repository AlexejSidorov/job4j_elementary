package ru.job4j.inheritance;

public class Engineer extends Profession {

    private int solutions;

    public int getSolutions() {
        return solutions;
    }

    public void toFixProblem(int problem, boolean can) {
        this.solutions += can ? problem : 0;
    }
}
