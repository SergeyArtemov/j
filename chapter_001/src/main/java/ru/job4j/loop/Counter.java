package ru.job4j.loop;

/**
 * Counter.
 *
 * @author sartemov
 * @since 05.05.2017
 * @version 1
 */
 public class Counter {
	/**
	 * c.
	 */
	private int c = 0;
	/**
	 * add.
	 * @param start **start**
	 * @param finish **finish**
	 * @return **add**
	 */
	public int add(int start, int finish) {
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				c = c + i;
			}
		}
	return c;
	}
}
