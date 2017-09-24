package ru.job4j.moneychanger;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * ChangeMoneyTest
 *
 * @author Sergey Artemov
 * @since 24.09.2017
 * @version 1
 */
public class ChangeMoneyTest {
    /**
     * Test
     */
    @Test
    public void whenTenThenRightChange() {
        ChangeMoney cm = new ChangeMoney();

        assertThat(cm.change(10), is("10-1 5-0 1-0\r\n10-0 5-2 1-0\r\n10-0 5-1 1-5\r\n10-0 5-0 1-10\r\n"));
    }
}
