package ru.job4j.max;

/**
 * Max.
 *
 * @author sartemov
 * @since 01.05.2017
 * @version 1
 */
public class Max {
	/**
	 * max.
	 * @param first **first**
	 * @param second **second**
	 * @return **max value**
	 */
	public int max(int first, int second) {
	return (first >= second) ? first : second;
	}
	/**
	 * max.
	 * @param first **first**
	 * @param second **second**
	 * @param third **third**
	 * @return **max value**
	 */
	public int max(int first, int second, int third) {
	return max(max(first, second), third);
	}
}