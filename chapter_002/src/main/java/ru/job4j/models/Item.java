package ru.job4j.models;

/**
 * Item. Заявка.
 *
 * @author Sergey Artemov
 * @since 12.07.2017
 * @version 1
 */
public class Item {
    private String id;
    public String name;
    public String description;
    public long create; // дата-время создания

    /**
     *Item. Конструктор класса.
     *@return ** **
     */

    /**
     *Item. Конструктор класса.
     *@return **item**
     */
    public Item(){
    }

    /**
     *Item. Конструктор класса.
     *@param name **название**
     *@param description **описание**
     *@param create **дата-время создания**
     *@return **item**
     */
    public Item(String name, String description, long create){
        this.name = name;
        this.description = description;
        this.create = create;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public long getCreate() {
        return this.create;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
