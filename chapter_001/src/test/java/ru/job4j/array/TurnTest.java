package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test Turn.
*
* @author Sergey Artemov (mailto:sergeyartemov@yandex.ru)
* @version $Id$
* @since 0.1
*/
public class TurnTest {
	/**
	* Test4.
	*/
	@Test
	public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		Turn turn = new Turn();
        int[] arr = {2, 6, 1, 4};
		int[] result = turn.back(arr);
		int[] expected = {4, 1, 6, 2};
        assertThat(result, is(expected));
	}
	/**
	* Test2.
	*/
	@Test
	public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		Turn turn = new Turn();
        int[] arr = {1, 2, 3, 4, 5};
		int[] result = turn.back(arr);
		int[] expected = {5, 4, 3, 2, 1};
        assertThat(result, is(expected));
	}
}