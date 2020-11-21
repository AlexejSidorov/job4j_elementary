package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String nameOfFirm;
    private int buildFin;

    public Builder(String nameOfFirm) {
        this.nameOfFirm = nameOfFirm;
    }

    public Builder(String nameOfFirm, int buildFin) {
        this.nameOfFirm = nameOfFirm;
        this.buildFin = buildFin;
    }

    public int getBuildFin() {
        return buildFin;
    }

    public String getNameOfFirm() {
        return nameOfFirm;
    }

    public String makeNewBuild(int builds) {
        this.buildFin += builds;
        return (builds > 1) ? "Buildings were completed" : "Building was completed";
    }
}
