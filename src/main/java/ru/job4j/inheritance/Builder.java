package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String nameOfFirm;
    private int buildFin;

    public Builder(String name, String surname, String education, String birthday, String nameOfFirm) {
        super(name, surname, education, birthday);
        this.nameOfFirm = nameOfFirm;
    }

    public Builder(String name, String surname, String education, String birthday, String nameOfFirm, int buildFin) {
        super(name, surname, education, birthday);
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
