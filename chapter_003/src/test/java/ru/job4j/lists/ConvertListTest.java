package ru.job4j.lists;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.HashMap;

/**
 * ConvertListTest.
 * @author Sergey Artemov
 * @since 30.10.2107
 * @version 1
 */
public class ConvertListTest {
    /**
     *
     */
    @Test
    public void whenArrayThenList() {
        ConvertList convert = new ConvertList();
        int[][] m = new int[][]{{1, 2, 3}, {4, 5, 6}};
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

    /**
     *
     */
    @Test
    public void whenListThenArray() {
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

        int[][] m1 = new int[][]{{1, 2, 0}, {4, 5, 6}, {7, 0, 0}};

        m0 = convert.toArray(list1, 3);

        assertThat(m0, is(m1));

    }

    /**
     *
     */
    @Test
    public void whenListOfArrayThenList() {
        /**
         *
         */
        ConvertList convert = new ConvertList();
        /**
         *
         */
        List<int[]> arrList = new LinkedList<>();

        arrList.add(new int[]{1, 2});
        arrList.add(new int[]{3, 4, 5});
        List<Integer> resList0 = convert.convert(arrList);

        List<Integer> resList1 = new LinkedList<>();
        resList1.add(new Integer(1));
        resList1.add(new Integer(2));
        resList1.add(new Integer(3));
        resList1.add(new Integer(4));
        resList1.add(new Integer(5));

        assertThat(resList0, is(resList1));

    }

    /**
     *
     */
    @Test
    public void whenListThenMap() {
        ConvertList convert = new ConvertList();
        List<User> list = new LinkedList<>();

        User us1 = new User(1, "Ivan", "Moscow");
        User us2 = new User(2, "Peter", "S.Peterburg");
        User us3 = new User(3, "Vladimir", "N.Novgorod");

        list.add(us1);
        list.add(us2);
        list.add(us3);

        HashMap<Integer, User> resMap0 = convert.process(list);

        HashMap<Integer, User> resMap1 = new HashMap<>();
        resMap1.put(new Integer(1), us1);
        resMap1.put(new Integer(2), us2);
        resMap1.put(new Integer(3), us3);

        assertThat(resMap0, is(resMap1));

    }

}
