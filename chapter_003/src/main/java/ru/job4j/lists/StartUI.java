package ru.job4j.lists;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Arrays;

/**
 * StartUI класс. Стартовый класс.
 * @author Sergey Artemov
 * @since 28.10.2107
 * @version 1
 */
public class StartUI {
    /**
     *
     * @param args ****
     */
    public static void main(String[] args) {
        StartUI startUI = new StartUI();
        startUI.start();
    }

    /**
     * start. Начать измерения
     */
    public void start() {
        long tadd, tdel;
        MeasurePerformanceOfList measure = new MeasurePerformanceOfList();

        /* LinkedList */
        LinkedList<String> linkedList = new LinkedList<>();
        tadd = measure.add(linkedList, 100000);
        System.out.print("LinkedList\r\n");
        System.out.printf("size after adds = %d, add time = %d; ", linkedList.size(), tadd);
        tdel = measure.delete(linkedList, 50000);
        System.out.printf("size after dels = %d, del time = %d \r\n", linkedList.size(), tdel);

        /* ArrayList */
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.print("ArrayList\r\n");
        tadd = measure.add(arrayList, 100000);
        System.out.printf("size after adds = %d, add time = %d; ", arrayList.size(), tadd);
        tdel = measure.delete(arrayList, 50000);
        System.out.printf("size after dels = %d, del time = %d \r\n", arrayList.size(), tdel);

        /* TreeSet */
        TreeSet<String> treeSet = new TreeSet<>();
        System.out.print("TreeSet\r\n");
        tadd = measure.add(treeSet, 100000);
        System.out.printf("size after adds = %d, add time = %d; ", treeSet.size(), tadd);
        tdel = measure.delete(treeSet, 50000);
        System.out.printf("size after dels = %d, del time = %d \r\n", treeSet.size(), tdel);

        /*Sorting*/
        List<User> listUser = new ArrayList<User>();
        listUser.addAll(
                Arrays.asList(
                        new User(1, "Ivan", "City11", 22),
                        new User(2, "Boris", "City22", 18),
                        new User(3, "Oleg", "City22", 18),
                        new User(4, "Zeman", "City33", 50)
                )
        );

        System.out.println(listUser);
        SortUser su = new SortUser();
        System.out.println(su.sort(listUser));

        /* Sorting with Comparator */
        List<User> listUser2 = new ArrayList<User>();
        listUser2.addAll(
                Arrays.asList(
                        new User(1, "Vladislav", "City11", 22),
                        new User(2, "Boris", "City22", 18),
                        new User(3, "Sergey", "City22", 18),
                        new User(4, "Petr", "City33", 50)
                )
        );

        //SortUser su2 = new SortUser();
        System.out.println(su.sortByNameLength(listUser2));


        List<User> listUser3 = new ArrayList<User>();
        listUser3.addAll(
                Arrays.asList(
                        new User(1, "Vladislav", "City11", 22),
                        new User(2, "Boris", "City22", 18),
                        new User(3, "Boris", "City22", 38),
                        new User(4, "Petr", "City33", 50)
                )
        );

        //SortUser su2 = new SortUser();
        System.out.println(su.sortByAllFields(listUser3));

    }
}
