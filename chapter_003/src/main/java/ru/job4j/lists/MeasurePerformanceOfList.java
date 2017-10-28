package ru.job4j.lists;

import java.util.Collection;
import java.util.Iterator;

/**
 * MeasurePerformanceOfList class. Класс для измерения производительности вставки и удаления в разные типы списков.
 * @Author Sergey Artemov
 * @since 28.10.2017
 * @version 1
 */
public class MeasurePerformanceOfList {
    /**
     *
     * @param collection **список**
     * @param amount **кол-во элементов на вставку**
     * @return **время в млсек на вставку**
     */
    public long add(Collection<String> collection, int amount) {
        String str;
        long startTime;
        long stopTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
        str = Long.toHexString(Double.doubleToLongBits(Math.random()));
        collection.add(str);
        }
        stopTime = System.currentTimeMillis();

        return stopTime - startTime;
    }

    /**
     *
     * @param collection **список**
     * @param amount **кол-во элементов на удаление**
     * @return **время в млсек на удаление**
     */
    public long delete(Collection<String> collection, int amount) {
        int i = 0;
        long startTime;
        long stopTime;
        Iterator iter = collection.iterator();

        startTime = System.currentTimeMillis();

        while (iter.hasNext() && i < amount) {
            iter.next();
            iter.remove();
            i++;
        }

        stopTime = System.currentTimeMillis();

        return stopTime - startTime;
    }
}
