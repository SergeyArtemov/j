package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test RorateArray.
*
* @author Sergey Artemov (mailto:sergeyartemov@yandex.ru)
* @version $Id$
* @since 0.1
*/
public class RotateArrayTest {
	/**
	* Test1.
	*/
	@Test
	public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
		RotateArray ra = new RotateArray();
		int[][] arr = {{1, 2}, {3, 4}};
		int[][] expected = {{3, 1}, {4, 2}};
		assertThat(ra.rotate(arr), is(expected));
	}
	/**
	* Test2.
	*/
	@Test
	public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
		RotateArray ra = new RotateArray();
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		assertThat(ra.rotate(arr), is(expected));
	}
}