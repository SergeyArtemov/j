package ru.job4j.lists;

import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

/**
 * ListCompare.
 * @author Sergey Artemov
 * @since 17.01.2018
 * @version 1
 */
public class ListCompare implements Comparator<List<Integer>> {
    @Override
    public int compare(List<Integer> left, List<Integer> right) {
        Iterator<Integer> iterLeft = left.iterator(); // Итератор по левому списку.
        Iterator<Integer> iterRight = right.iterator(); // Итератор по правому списку.
        int diff = 0;
        boolean leftHasNext = true;
        boolean rightHasNext = true;
        int iterLeftNext;
        int iterRightNext;

        while ((leftHasNext || rightHasNext) && (diff == 0)) {
            leftHasNext = iterLeft.hasNext(); // Текущий элемент левого списка.
            rightHasNext = iterRight.hasNext(); // Текущий элемент правого списка.
            if (leftHasNext && !rightHasNext) { // в левом списке имеется запись, в правом - нет
                diff = 1;
            } else
            if (!leftHasNext && rightHasNext) { // в правом списке имеется запись, в левом - нет
                diff = -1;
            } else
            if (leftHasNext && rightHasNext) { // в обоих списках есть записи
                iterLeftNext = iterLeft.next().intValue();
                iterRightNext = iterRight.next().intValue();
                if (iterLeftNext >  iterRightNext) { // Левое значение больше, чем правое
                diff = 1;
                } else if (iterLeftNext <  iterRightNext) { // Правое значение больше, чем левое
                diff = -1;
                }
            }
        }
        return diff;
    }
}
