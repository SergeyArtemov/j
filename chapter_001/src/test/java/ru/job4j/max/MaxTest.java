package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test Max.
*
* @author Sergey Artemov (mailto:sergeyartemov@yandex.ru)
* @version $Id$
* @since 0.1
*/

public class MaxTest {
	/**
	* Tests.
	* max
	*/
	@Test
	public void whenMaxOneAndTwoThenTwo() {
	Max maxObj = new Max();

	double result = maxObj.max(1, 2);
	double expected = 2;
	assertThat(result, is(expected));
	}
		/**
	* Tests.
	* max3
	*/
	@Test
	public void whenMaxOneTwoThreeThenThree() {
	Max maxObj = new Max();

	double result = maxObj.max(1, 2, 3);
	double expected = 3;
	assertThat(result, is(expected));
	}
}
