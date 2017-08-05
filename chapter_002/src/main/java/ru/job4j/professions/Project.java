package ru.job4j.professions;

/**
 * Класс Проект. Created by serge_000 on 03.07.2017.
 */
public class Project {
    /**
     * Название проекта.
     */
    private String name;

    /**
     *
     * @param name **name**
     */
    public Project(String name) {
        this.name = name;
    }

    /**
     *
     * @return **name**
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @param name **name**
     */
    public void setName(String name) {
        this.name = name;
    }
}