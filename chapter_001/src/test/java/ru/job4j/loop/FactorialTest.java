package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test Factorial.
*
* @author Sergey Artemov (mailto:sergeyartemov@yandex.ru)
* @version $Id$
* @since 0.1
*/
public class FactorialTest {
	/**
	* Test5_120.
	*/
	@Test
	public void whenCalculateFactorialForFoveThenOneHandreedTwenty() {
	Factorial f = new Factorial();
	int res = f.calc(5);
	int expected = 120;
	assertThat(res, is(expected));
	}
	/**
	* Test0_1.
	*/
	@Test
	public void whenCalculateFactorialForZeroThenOne() {
	Factorial f = new Factorial();
	int res = f.calc(0);
	int expected = 1;
	assertThat(res, is(expected));
	}
}
