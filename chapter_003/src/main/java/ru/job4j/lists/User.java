package ru.job4j.lists;

/**
 * Class User.
 * @author Sergey Artemov
 * @since 06.11.2017
 * @version 1
 */
public class User {
    private int id;
    private String name;
    private String city;

    /**
     * Class constructor.
     * @param id **id**
     * @param name **name**
     * @param city **city**
     */
    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
