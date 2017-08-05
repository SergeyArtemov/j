package ru.job4j.professions;

import java.util.ArrayList;

/**
 * Класс Учитель. Created by serge_000 on 29.06.2017.
 */
public class Teacher extends Profession {

    /**
     * первый предмет.
     */
    private String firstSubject; // первый предмет

    /**
     * второй предмет.
     */
    private String secondSublect; // второй предмет

    /**
     * список классов, где учил.
     */
    private ArrayList<SchoolClass> listOfClass; //список классов, где учил

    /**
     *
     * @return listOfClass
     */
    public ArrayList<SchoolClass> getListOfClass() {
        return listOfClass;
    }

    /**
     *
     */
    public Teacher() {
        listOfClass = new ArrayList<>();
    }

    /**
     *
     * @return firstSubject
     */
    public String getFirstSubject() {
        return firstSubject;
    }

    /**
     *
     * @param firstSubject **firstSubject**
     */
    public void setFirstSubject(String firstSubject) {
        this.firstSubject = firstSubject;
    }

    /**
     *
     * @return secondSublect
     */
    public String getSecondSublect() {
        return secondSublect;
    }

    /**
     *
     * @param secondSublect **secondSublect**
     */
    public void setSecondSublect(String secondSublect) {
        this.secondSublect = secondSublect;
    }
    /**
     * teachClass.
     * @param schoolClass **schoolClass**
     * @return **строка**
     */
    public String teachClass(SchoolClass schoolClass) {
        listOfClass.add(schoolClass);
        return this.getTheName() + " учит(-ил) класс " + schoolClass.getName();
    }
}
