package ru.job4j.lists;

import java.util.Comparator;
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
public class SortUser {
    /**
     *
     * @param listUsers ****
     * @return Set **sorted TreeSet**
     */
    Set<User> sort(List<User> listUsers) {
        TreeSet setList = new TreeSet<User>();
        Iterator<User> iter = listUsers.iterator();
        while (iter.hasNext()) {
            setList.add(iter.next());
        }
        return setList;
    }

    /**
     * sortByNameLength.
     * @param userList ****
     * @return userList ****
     */
    List<User> sortByNameLength(List<User> userList) {
            userList.sort(new Comparator<User>() {
                            @Override
                                    public int compare(User u1, User u2) {
                                        int len1 = u1.getName().length();
                                        int len2 = u2.getName().length();
                                        return (len1 > len2 ? 1 : (len1 < len2 ? -1 : u2.getId() - u1.getId()));
                                    }
        });
        return userList;
    }

    /**
     * sortByAllFields.
     * @param userList ****
     * @return userList
     */
    List<User> sortByAllFields(List<User> userList) {
        userList.sort(new Comparator<User>() {
                    @Override
                    public int compare(User u1, User u2) {
                        int ordName = u1.getName().compareTo(u2.getName());
                        int ordAge = (u1.getAge() - u2.getAge()) / Math.abs(u1.getAge() - u2.getAge());
                        int ord = (ordName != 0 ? ordName : (ordAge != 0 ? ordAge : u2.getId() - u1.getId()));
                        return ord;
            }
        });
        return userList;
    }
}