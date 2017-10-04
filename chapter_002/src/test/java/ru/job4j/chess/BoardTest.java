package ru.job4j.chess;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * BoardTest class.
 * @author Sergey Artemov
 * @since 01.10.2017
 * @version 1
 */
public class BoardTest {
    @Test
    public void whenRightWayThenFigureIsPutOnNewPosition() {
        Board b = new Board();
        boolean res = b.move(new Cell(3,1), new Cell(5,3));
        assertThat(res, is(true));

    }
}
