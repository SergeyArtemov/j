package ru.job4j.condition;
import static org.hamcrest.number.IsCloseTo.closeTo;
import org.junit.Test;
//import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test Triangle.
*
* @author Sergey Artemov (mailto:sergeyartemov@yandex.ru)
* @version $Id$
* @since 0.1
*/
public class TriangleTest {
	/**
	* Test.
	*/
	@Test
	public void whenTriangleThenArea() {
	Point a = new Point(0, 0);
	Point b = new Point(0, 1);
	Point c = new Point(1, 0);
	Triangle t = new Triangle(a, b, c);
	double result = t.area();
	double expected = 0.5;
	assertThat(result, closeTo(expected, 0.01));
	}
}