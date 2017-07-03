package ru.job4j.professions;

/**
 * Класс Пациет. Created by serge_000 on 03.07.2017.
 */
public class Patient {
    private String theName;
    public Patient (String theName){
        this.theName = theName;
    }
    public String getTheName(){
        return this.theName;
    }
    public void setTheName(String theName){
        this.theName = theName;
    }
}
