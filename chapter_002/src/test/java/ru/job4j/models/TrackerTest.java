package ru.job4j.models;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test of Tracker.
 *
 * @author Sergey Artemov (mailto:sergeyartemov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class TrackerTest {
     /**
     * Test.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findAll(), is(item));
    }
     /**
     * Test.
     */
    @Test
    public void whenUpdateItemThenTrackerHasUpdatedItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        item.setName("test2");
        tracker.update(item);
        assertThat(tracker.findAll()[0].getName(), is(item.getName()));
    }
    /**
     * Test.
     */
    @Test
    public void whenDeleteItemThenTrackerHasNotThisItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        Item item2 = new Item("test2", "testDescription2", 124L);
        Item item3 = new Item("test3", "testDescription3", 124L);
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        tracker.delete(item2);
        assertThat(tracker.findAll()[0].getName() + tracker.findAll()[1].getName(), is("test1test3"));
    }
    /**
     * Test.
     */
    @Test
    public void whenFindByNameThenGetIt() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        Item item2 = new Item("test2", "testDescription2", 124L);
        Item item3 = new Item("test3", "testDescription3", 124L);
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        assertThat(tracker.findByName("test2"), is(item2));
    }
    /**
     * Test.
     */
    @Test
    public void whenFindByIdThenGetIt() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        Item item2 = new Item("test2", "testDescription2", 124L);
        Item item3 = new Item("test3", "testDescription3", 124L);
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        assertThat(tracker.findById(item2.getId()), is(item2));
    }
}
