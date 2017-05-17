package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test DuplicateArray.
*
* @author Sergey Artemov (mailto:sergeyartemov@yandex.ru)
* @version $Id$
* @since 0.1
*/
public class ArrayDuplicateTest {
	/**
	*Test1.
	*/
	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
	ArrayDuplicate ar = new ArrayDuplicate();
	String[] arr = {"Привет", "Мир", "Привет", "Супер", "Мир"};
	String[] res = ar.remove(arr);
	String[] expected = {"Привет", "Мир", "Супер"};
	assertThat(res, is(expected));
	}
}
