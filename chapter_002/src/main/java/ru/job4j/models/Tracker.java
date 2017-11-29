package ru.job4j.models;

import java.util.*;

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
    private Item[] items = new Item[100]; // массив для хранения заявок
    /**
     *
     */
    private List<Item> itemsL = new ArrayList<>(); // список ArrayList для хранения заявок
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
        //this.items[position++] = item; /* старый вариант */
        this.itemsL.add(position++, item); /* новый вариант */
        return item;
    }

    /**
     *update. Обновление заявки.
     *@param item **заявка**
     */
    public void update(Item item) {
        String idd = item.getId();
        /* старый вариант */
        /*for (int i = 0; i < position; i++) {
            if (items[i] != null && items[i].getId() == idd) {
                items[i] = item;
                break;
            }
        }*/

        /* Новый вариант */
        ListIterator iter = itemsL.listIterator();
        Item item1;
        int ind;
        while (iter.hasNext()) {
            ind = iter.nextIndex();
            item1 = (Item)iter.next();
            if (item1.getId() == idd) {
                itemsL.set(ind, item);
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
        /*старый вариант*/
        /*
        for (int i = 0; i < position; i++) {
            if (items[i].getId() == idd) {
                System.arraycopy(items, i + 1, items, i, this.position - i);
                items[this.position] = null;
                position--;
                break;
            }
        }*/
        /* Новый вариант */
        ListIterator iter = itemsL.listIterator();
        Item item1;
        while(iter.hasNext()){
            item1 = (Item)iter.next();
            if (item1.getId() == idd) {
                iter.remove();
            }
        }
        return;
    }

    /**
     *findAll. Возвращает список всех заявок.
     *@return **найденная заявка**
     */
    public Item[] findAll() {
        Item[] result = new Item[itemsL.size()];
        /* Новый вариант */
        ListIterator iter = itemsL.listIterator();
        int index = 0;
        while (iter.hasNext()) {
            result[index++] = (Item)iter.next();
        }
        /*старый вариант*/
        /*for (int index = 0; index < this.position; index++) {
            result[index] = this.items[index];
        }*/
        return result;
    }

    /**
     *findByName. Поиск заявки по имени.
     *@param key **заявка**
     *@return **найденная заявка**
     */
    public Item findByName(String key) {
        Item result = null;
        Item item1 = null;
        /*старый вариант*/
        /*
        for (int i = 0; i < this.position; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                result = items[i];
                break;
            }
        }
        */

        /* Новый вариант */
        ListIterator iter = itemsL.listIterator();
        while (iter.hasNext()) {
            item1 = ((Item)(iter.next()));
            if ( item1.getName().equals(key) ) {
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
        Item item1 = null;

        /* Новый вариант */
        ListIterator iter = itemsL.listIterator();
        while (iter.hasNext()) {
            item1 = ((Item)(iter.next()));
            if ( item1.getId() == id ) {
                result = item1;
                break;
            }
        }

        /*старый вариант*/
        /*
        for (Item item : this.items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }*/

        return result;
    }
}
