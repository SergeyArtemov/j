package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test Point.
*
* @author Sergey Artemov (mailto:sergeyartemov@yandex.ru)
* @version $Id$
* @since 0.1
*/
public class PointTest {
	/**
	* Test.
	*/
	@Test
	public void whenFourAndThreeThenTrue() {
	Point point = new Point();
	point.point(2, 11);
	boolean result = point.is(4, 3);
	boolean expected = true;
	assertThat(result, is(expected));
	}
}