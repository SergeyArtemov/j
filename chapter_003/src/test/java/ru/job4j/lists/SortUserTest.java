package ru.job4j.lists;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * SortUserTest.
 * @author Sergey Artemov
 * @since 16.12.2017
 * @version 1
 */
public class SortUserTest {
    /**
     * Test WhenListThenSortedThree
     */
    @Test
    public void WhenListThenSortedThree() {
        List<User> listUser = new ArrayList<>();

        listUser.addAll(
                Arrays.asList(
                        new User(1,"Ivan","City1",22),
                        new User(2,"Boris","City2",18),
                        new User(3,"Oleg","City2",18),
                        new User(4,"Zeman","City3",50)
                )
        );

        SortUser su = new SortUser();
        Set<User> res = su.sort(listUser);

        Set<User> expected = new TreeSet<>();
        expected.addAll(
                Arrays.asList(
                        new User(1,"Ivan","City1",22),
                        new User(2,"Boris","City2",18),
                        new User(3,"Oleg","City2",18),
                        new User(4,"Zeman","City3",50)
                )
        );

        assertThat(res,is(expected));
    }

    /**
     * Test WhenInvokeSortByNameLengthThenGetSortedList
     */
    @Test
    public void WhenInvokeSortByNameLengthThenGetSortedList(){
        List<User> listUser = new ArrayList<>();
        listUser.addAll(
                Arrays.asList(
                        new User(1,"Vladislav","City11",22),
                        new User(2,"Boris","City22",18),
                        new User(3,"Sergey","City22",18),
                        new User(4,"Petr","City33",50)
                )
        );

        SortUser su = new SortUser();
        List<User> result = su.sortByNameLength(listUser);
        List<User> expected = new ArrayList<>();
        expected.addAll(
                Arrays.asList(
                        new User(4,"Petr","City33",50),
                        new User(2,"Boris","City22",18),
                        new User(3,"Sergey","City22",18),
                        new User(1,"Vladislav","City11",22)
                )
        );
    }

    /**
     * Test WhenInvokeSortByAllFieldsThenGetSortedList
     */
    @Test
    public void WhenInvokeSortByAllFieldsThenGetSortedList(){
        List<User> listUser = new ArrayList<>();
        listUser.addAll(
                Arrays.asList(
                        new User(1,"Vladislav","City11",22),
                        new User(2,"Boris","City22",18),
                        new User(3,"Boris","City22",38),
                        new User(4,"Petr","City33",50)
                )
        );

        SortUser su = new SortUser();
        List<User> result = su.sortByAllFields(listUser);
        List<User> expected = new ArrayList<>();
        expected.addAll(
                Arrays.asList(
                        new User(2,"Boris","City22",18),
                        new User(3,"Boris","City22",38),
                        new User(4,"Petr","City33",50),
                        new User(1,"Vladislav","City11",22)
                )
        );
    }

}
