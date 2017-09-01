package ru.job4j.models;

import java.util.Random;

/**
 * Tracker. Управления поступающими заявками.
 *
 * @author Sergey Artemov
 * @since 12.07.2017
 * @version 1
 */
public class Tracker {
    /**
     *
     */
    private Item[] items = new Item[100]; // массив для хранения заявок
    /**
     *
     */
    private int position = 0; // текущая позиция указателя в массиве заявок
    /**
     *
     */
    private static final Random RN = new Random(); // класс для генерации случайных чисел

    /**
     *add. Добавление заявки.
     *@param item **заявка**
     *@return **заявка, но с уже заполненным id**
     */
    public Item add(Item item) {
        item.setId(String.valueOf(RN.nextInt(100)));
        this.items[position++] = item;
        return item;
    }

    /**
     *update. Обновление заявки.
     *@param item **заявка**
     */
    public void update(Item item) {
        String idd = item.getId();
        for (int i = 0; i < position; i++) {
            if (items[i] != null && items[i].getId() == idd) {
                items[i] = item;
                break;
            }
        }
        return;
    }

    /**
     *delete. Удаление заявки.
     *@param item **заявка**
     */
    public void delete(Item item) {
        String idd = item.getId();
        for (int i = 0; i < position; i++) {
            if (items[i].getId() == idd) {
                System.arraycopy(items, i + 1, items, i, this.position - i);
                items[this.position] = null;
                position--;
                break;
            }
        }
        return;
    }

    /**
     *findAll. Поиск заявки по id.
     *@return **найденная заявка**
     */
    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index < this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

    /**
     *findByName. Поиск заявки по имени.
     *@param key **заявка**
     *@return **найденная заявка**
     */
    public Item findByName(String key) {
        Item result = null;
        for (int i = 0; i < this.position; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                result = items[i];
                break;
            }
        }
        //result = items[1];
        return result;

    }

    /**
     *findById. Поиск заявки по id.
     *@param id **заявка**
     *@return **найденная заявка**
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}
