package ru.job4j.lists;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 * StartUI класс. Стартовый класс.
 * @Author Sergey Artemov
 * @Since 28.10.2107
 * @Version 1
 */
public class StartUI {

    public static void main(String[] args) {
        StartUI startUI = new StartUI();
        startUI.start();
    }

    /**
     * start. Начать измерения
     */
    public void start() {
        long t_add, t_del;
        MeasurePerformanceOfList measure = new MeasurePerformanceOfList();

        /* LinkedList */
        LinkedList<String> linkedList = new LinkedList<>();
        t_add = measure.add(linkedList, 100000);
        System.out.print("LinkedList\r\n");
        System.out.printf("size after adds = %d, add time = %d; ",linkedList.size(), t_add);
        t_del = measure.delete(linkedList, 50000);
        System.out.printf("size after dels = %d, del time = %d \r\n",linkedList.size(), t_del);

        /* ArrayList */
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.print("ArrayList\r\n");
        t_add = measure.add(arrayList, 100000);
        System.out.printf("size after adds = %d, add time = %d; ",arrayList.size(), t_add);
        t_del = measure.delete(arrayList, 50000);
        System.out.printf("size after dels = %d, del time = %d \r\n",arrayList.size(), t_del);

        /* TreeSet */
        TreeSet<String> treeSet = new TreeSet<>();
        System.out.print("TreeSet\r\n");
        t_add = measure.add(treeSet, 100000);
        System.out.printf("size after adds = %d, add time = %d; ",treeSet.size(), t_add);
        t_del = measure.delete(treeSet, 50000);
        System.out.printf("size after dels = %d, del time = %d",treeSet.size(), t_del);
    }
}
