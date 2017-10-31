package ru.job4j.lists;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * ConvertListTest.
 * @author Sergey Artemov
 * @since 30.10.2107
 * @version 1
 */
public class ConvertListTest {
    @Test
    public void WhenArrayThenList() {
        ConvertList convert = new ConvertList();
        int[][] m = new int[][]{{1,2,3},{4,5,6}};
        List list0;
        List<Integer> list1 = new LinkedList<>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(2));
        list1.add(Integer.valueOf(3));
        list1.add(Integer.valueOf(4));
        list1.add(Integer.valueOf(5));
        list1.add(Integer.valueOf(6));

        list0 = convert.toList(m);

        assertThat(list0, is(list1));

    }

    @Test
    public void WhenListThenArray() {
        ConvertList convert = new ConvertList();
        int[][] m0;
        //List list0;
        List<Integer> list1 = new LinkedList<>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(2));
        list1.add(null);
        list1.add(Integer.valueOf(4));
        list1.add(Integer.valueOf(5));
        list1.add(Integer.valueOf(6));
        list1.add(Integer.valueOf(7));

        int[][] m1 = new int[][]{{1, 2, 0},{4, 5, 6},{7, 0, 0}};

        m0 = convert.toArray(list1,3);

        assertThat(m0, is(m1));

    }
}
