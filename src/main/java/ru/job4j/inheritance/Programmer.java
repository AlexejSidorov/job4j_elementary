package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private boolean isMakingProg;
    private boolean isFixingCode;

    public Programmer(String name, String surname, String education, String birthday, boolean isFixingCode, boolean isMakingProg) {
        super(name, surname, education, birthday);
        this.isFixingCode = isFixingCode;
        this.isMakingProg = isMakingProg;
    }

    public String fixCode() {
        return isFixingCode ? "Code was fixed" : "Code was not fixed";
    }

    public String makeNewProg() {
        return isMakingProg ? "New program will done" : "New program won`t done";
    }
}
