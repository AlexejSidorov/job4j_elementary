package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setAdmissionDate(new Date("06/26/2006"));
        student.setFullName("Sidorov Aleksey");
        student.setNumOfGroup(6);
        System.out.println("Student name: " + student.getFullName() + "\n"
                + "Number of group: " + student.getNumOfGroup() + "\n"
                + "Admission date: " + student.getAdmission());
    }
}
