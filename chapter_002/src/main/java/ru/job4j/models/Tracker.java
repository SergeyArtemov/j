package ru.job4j.models;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * Tracker. Управления поступающими заявками.
 *
 * @author Sergey Artemov
 * @since 29.11.2017
 * @version 2
 */
public class Tracker {
    /**
     *
     */
 //   private Item[] items = new Item[100]; // массив для хранения заявок
    /**
     *
     */
    private List<Item> itemsL = new ArrayList<>(); // список ArrayList для хранения заявок
    /**
     *
     */
    //private int position = 0; // текущая позиция указателя в массиве заявок
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
        itemsL.add(item); /* новый вариант */
        return item;
    }

    /**
     *update. Обновление заявки.
     *@param item **заявка**
     */
    public void update(Item item) {
        int ind;
        ind = itemsL.indexOf(item);
        if (ind != -1) {
            itemsL.set(ind, item);
        }
        return;
    }

    /**
     *delete. Удаление заявки.
     *@param item **заявка**
     */
    public void delete(Item item) {
        itemsL.remove(item);
        return;
    }

    /**
     *findAll. Возвращает список всех заявок.
     *@return **найденная заявка**
     */
    public Item[] findAll() {
        Item[] result = new Item[itemsL.size()];
        itemsL.toArray(result);
        return result;
    }

    /**
     *findByName. Поиск заявки по имени.
     *@param key **заявка**
     *@return **найденная заявка**
     */
    public Item findByName(String key) {
        Item result = null;
        Item item1;

        /* Новый вариант */
        ListIterator<Item> iter = itemsL.listIterator();
        while (iter.hasNext()) {
            item1 = ((Item) (iter.next()));
            if (item1.getName().equals(key)) {
                result = item1;
                break;
            }
        }
        return result;

    }

    /**
     *findById. Поиск заявки по id.
     *@param id **заявка**
     *@return **найденная заявка**
     */
    public Item findById(String id) {
        Item result = null;
        Item item1;

        /* Новый вариант */
        ListIterator<Item> iter = itemsL.listIterator();
        while (iter.hasNext()) {
            item1 = ((Item) (iter.next()));
            if (item1.getId() == id) {
                result = item1;
                break;
            }
        }
        return result;
    }
}
