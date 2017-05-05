package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test Counter.
*
* @author Sergey Artemov (mailto:sergeyartemov@yandex.ru)
* @version $Id$
* @since 0.1
*/
public class CounterTest {
	/**
	* Test.
	*/
	@Test
	public void whenOneAndSixThenThree() {
	Counter counter = new Counter();
	int result = counter.add(1, 6);
	int expected = 3;
	assertThat(result, is(expected));
	}
}