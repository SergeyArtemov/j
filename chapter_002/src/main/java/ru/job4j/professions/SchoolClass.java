package ru.job4j.professions;

/**
 * Класс школьный класс. Created by serge_000 on 03.07.2017.
 */
public class SchoolClass {
    /**
     * наименование.
     */
    private String name;

    /**
     *
     * @param name **name**
     */
    public SchoolClass(String name) {
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
