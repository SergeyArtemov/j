package ru.job4j.string;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test contains.
*
* @author Sergey Artemov (mailto:sergeyartemov@yandex.ru)
* @version $Id$
* @since 0.1
*/
public class MystringTest {
	/**
	* Test1.
	* add
	*/
	@Test
	public void whenSubstringThenTrue() {
	Mystring str = new Mystring();
	boolean result = str.contains("asdfghjkl", "dfg");
	boolean expected = true;
	assertThat(result, is(expected));
	}
	/**
	* Test2.
    * substruct.
	*/
	@Test
	public void whenNotSubstringThenFalse() {
	Mystring str = new Mystring();
	boolean result = str.contains("asdfghjkl", "dwfg");
	boolean expected = false;
	assertThat(result, is(expected));
	}

}