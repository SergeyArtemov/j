package ru.job4j.lists;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * SortUserTest.
 * @author Sergey Artemov
 * @since 16.12.2017
 * @version 1
 */
public class SortUser{
    /**
     *
     * @param listUsers
     * @return sorted TreeSet
     */
    Set<User> sort(List<User> listUsers){
        TreeSet setList = new TreeSet<User>();
        Iterator<User> iter = listUsers.iterator();
        while (iter.hasNext()) {
            setList.add(iter.next());
        }
        return setList;
    }
}