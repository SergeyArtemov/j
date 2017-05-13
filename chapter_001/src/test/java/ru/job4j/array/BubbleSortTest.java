package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test BubbleSort.
*
* @author Sergey Artemov (mailto:sergeyartemov@yandex.ru)
* @version $Id$
* @since 0.1
*/
public class BubbleSortTest {
	/**
	* Test.
	*/
	@Test
	public void whenSortArrayWithTenElementsThenSortedArray() {
		BubbleSort st = new BubbleSort();
		int[] arr = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
		int[] expected = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
		assertThat(st.sort(arr), is(expected));
	}
}