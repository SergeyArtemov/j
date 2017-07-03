package ru.job4j.professions;

import java.util.ArrayList;

/**
 * Класс Учитель. Created by serge_000 on 29.06.2017.
 */
public class Teacher extends Profession {
    private String firstSubject;
    private String secondSublect;
    public ArrayList<SchoolClass> listOfClass;

    public Teacher(){
        listOfClass = new ArrayList<>();
    }

    public String getFirstSubject() {
        return firstSubject;
    }

    public void setFirstSubject(String firstSubject) {
        this.firstSubject = firstSubject;
    }

    public String getSecondSublect() {
        return secondSublect;
    }

    public void setSecondSublect(String secondSublect) {
        this.secondSublect = secondSublect;
    }

    public void teachClass(SchoolClass schoolClass){
        listOfClass.add(schoolClass);
    }
}
