package ru.job4j.lists;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
/**
 * ConvertList.
 * @author Sergey Artemov
 * @since 30.10.2017
 * @version 1
 */
public class ConvertList {
    /**
     *
     * @param array
     * @return **list**
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new LinkedList<>();

        for (int x[] : array) {
            for (int y : x) {
                list.add(y);
            }
        }
        return list;
    }

    /**
     *
     * @param list
     * @param rows ***count of rows*
     * @return
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int cols;
        Iterator iter = list.iterator();
        Integer curElement;

        cols = list.size() / rows + (list.size() % rows > 0 ? 1 : 0);

        int[][] array = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (iter.hasNext()) {
                    curElement = (Integer)iter.next();
                        array[i][j] = (curElement != null ? curElement.intValue() : 0);
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}