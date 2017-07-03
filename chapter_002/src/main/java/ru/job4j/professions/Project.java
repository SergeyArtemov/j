package ru.job4j.professions;

/**
 * Класс Проект. Created by serge_000 on 03.07.2017.
 */
public class Project {
    private String name;
    public Project (String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}