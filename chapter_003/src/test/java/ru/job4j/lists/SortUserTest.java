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
    @Test
    public void WhenListThenSortedThree() {
        List<User> listUser = new ArrayList<>();

        listUser.addAll(
                Arrays.asList(
                        new User(1,"Ivan","City1",22),
                        new User(2,"Boris","City2",18),
                        new User(3,"Zeman","City3",50)
                )
        );

        SortUser su = new SortUser();
        Iterator iter = (su.sort(listUser)).iterator();

        assertThat(iter.next().equals(new User(2,"Boris","City2",18)) &&
                        iter.next().equals(new User(1,"Ivan","City1",22)) &&
                        iter.next().equals(new User(3,"Zeman","City3",50))
                ,is(true));
    }
}
