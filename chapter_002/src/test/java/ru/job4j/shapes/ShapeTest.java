package ru.job4j.shapes;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Тест для вывода на консоль фигур.
 * @author Sergey Artemov
 * @since 14.08.2017
 * @version 1
 */
public class ShapeTest {
/**
 * Test Triangle
 */
@Test
    public void WhenTriangleThenTriangleIsInOutputStream() {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    Paint p = new Paint();
    p.draw(new Triangle());
    assertThat(out.toString(),
                is(String.format("   *     * *   *   * *******"))
    );
}

/**
* Test Square
*/
@Test
    public void WhenSquareThenSquareIsInOutputStream() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Paint p = new Paint();
        p.draw(new Square());
        assertThat(out.toString(),
                is(String.format("*****  **  *****"))
        );
    }
}

