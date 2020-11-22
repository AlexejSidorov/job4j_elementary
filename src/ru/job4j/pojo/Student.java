package ru.job4j.pojo;

import java.util.Date;

public class Student {

    private String fullName;
    private int numOfGroup;
    private Date admissionDate;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumOfGroup() {
        return numOfGroup;
    }

    public void setNumOfGroup(int numOfGroup) {
        this.numOfGroup = numOfGroup;
    }

    public Date getAdmission() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }
}
