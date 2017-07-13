package ru.job4j.models;

/**
 * Created by Sergey Artemov on 13.07.2017.
 * Тесты для тестирования класс Tracker.
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","testDescription",123L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    @Test
    public void whenUpdateItemThenTrackerHasUpdatedItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","testDescription",123L);
        tracker.add(item);
        item.name = "test2";
        tracker.update(item);
        assertThat(tracker.findAll()[0].getName(), is(item.getName()));
    }

    @Test
    public void whenDeleteItemThenTrackerHasNotThisItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","testDescription",123L);
        Item item2 = new Item("test2","testDescription2",124L);
        Item item3 = new Item("test3","testDescription3",124L);
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        tracker.delete(item2);
        assertThat(tracker.findAll()[0].getName()+tracker.findAll()[1].getName(), is("test1test3"));
    }

    @Test
    public void whenFindByNameThenGetIt() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","testDescription",123L);
        Item item2 = new Item("test2","testDescription2",124L);
        Item item3 = new Item("test3","testDescription3",124L);
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        assertThat(tracker.findByName("test2"), is(item2));
    }

    @Test
    public void whenFindByIdThenGetIt() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","testDescription",123L);
        Item item2 = new Item("test2","testDescription2",124L);
        Item item3 = new Item("test3","testDescription3",124L);
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        assertThat(tracker.findById(item2.getId()), is(item2));
    }
}
