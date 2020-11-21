package ru.job4j.inheritance;

public class Programmer {

    private boolean isMakingProg;
    private boolean isFixingCode;

    public Programmer(boolean isFixingCode, boolean isMakingProg) {
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
