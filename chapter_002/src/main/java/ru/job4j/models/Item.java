package ru.job4j.models;

/**
 * Item. Заявка.
 *
 * @author Sergey Artemov
 * @since 12.07.2017
 * @version 1
 */
public class Item {
    /**
     *
     */
    private String id;
    /**
     *
     * @return **id**
     */
    public String getId() {
        return this.id;
    }
    /**
     *
     * @param id **id**
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     *
     */
    private String name;

    /**
     *
     * @param name **name**
     */
    public void setName(String name) {
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
     */
    private String description;
    /**
     *
     * @return **description**
     */
    public String getDescription() {
        return this.description;
    }
    /**
     *
     * @param description **description**
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     *
     */
    private long create; // дата-время создания
    /**
     *
     * @return **create**
     */
    public long getCreate() {
        return this.create;
    }

    /**
     *
     * @param create **create**
     */
    public void setCreate(long create) {
        this.create = create;
    }

    /**
     *Item. Конструктор класса.
     *@return ****
     */

    /**
     *Item. Конструктор класса.
     */
    public Item() {
    }

    /**
     *Item. Конструктор класса.
     *@param name **название**
     *@param description **описание**
     *@param create **дата-время создания**
     */
    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (create != item.create) return false;
        if (id != null ? !id.equals(item.id) : item.id != null) return false;
        if (name != null ? !name.equals(item.name) : item.name != null) return false;
        return description != null ? description.equals(item.description) : item.description == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (int) (create ^ (create >>> 32));
        return result;
    }
}
