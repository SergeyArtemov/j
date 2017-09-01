package ru.job4j.models;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test of StubInput.
 *
 * @author Sergey Artemov (mailto:sergeyartemov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class StubInputTest {
    /**
     * проверка добавления и вывода всех заявок.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "n1", "d1", "n", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(tracker, input).start();     //   создаём StartUI и вызываем метод start()
        assertThat(tracker.findAll()[0].getName(), is("n1")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    /**
     * проверка редактирования и удаления заявки.
     */
    @Test
    public void whenDeleteThenGetItemDeleted() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item());
        //создаём StubInput с последовательностью действий
        Input input = new StubInput(new String[]{"2", item.getId(), "n11", "d11", "n", "0", "n1", "d1", "n", "3", item.getId(), "n", "6"});
        // создаём StartUI и вызываем метод start()
        new StartUI(tracker, input).start();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findAll()[0].getName(), is("n1"));
    }

    /**
     * проверка редактирования.
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item());
        //создаём StubInput с последовательностью действий
        Input input = new StubInput(new String[]{"2", item.getId(), "n11", "d11", "n", "6"});
        // создаём StartUI и вызываем метод start()
        new StartUI(tracker, input).start();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("n11"));
    }
}
