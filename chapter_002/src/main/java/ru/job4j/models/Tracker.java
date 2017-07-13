package ru.job4j.models;

/**
 * Класс Tracker - для управления поступающими заявками.
 * Created by Sergey Artemov on 12.07.2017.
 */
import java.util.*;

public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;
    private static final Random RN = new Random();
    public Item add(Item item){
        item.setId(String.valueOf(RN.nextInt(100)));
        this.items[position++] = item;
        return item;
    }
    public void update(Item item){
        String Idd = item.getId();
        for(int i = 0; i < position; i++){
            if (items[i].getId() == Idd){
                items[i] = item;
                break;
            }
        }
    }
    public void delete(Item item){
        String Idd = item.getId();
        for(int i = 0; i < position; i++){
            if (items[i].getId() == Idd){
                System.arraycopy(items, i+1, items, i, this.position - i);
                items[this.position] = null;
                break;
            }
        }

    }
    public Item[] findAll(){
        Item[] result = new Item[this.position];
        for(int index = 0; index < this.position; index++){
            result[index] = this.items[index];
        }
        return result;
    }

    public Item findByName(String key){
        Item result = null;
        for(int i = 0; i < this.position; i++){
            if (items[i] != null && items[i].getName().equals(key)) {
                result = items[i];
                break;
            }
        }
        //result = items[1];
        return result;

    }

    protected Item findById(String id){
        Item result = null;
        for(Item item : this.items){
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}
