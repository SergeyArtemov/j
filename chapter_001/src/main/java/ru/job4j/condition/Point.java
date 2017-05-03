package ru.job4j.condition;

/**
 * Point.
 *
 * @author sartemov
 * @since 03.05.2017
 * @version 1
 */
public class Point {
	/**
	* x.
	*/
	private int x;
	/**
	* y.
	*/
	private int y;
		/**
	 * point.
	 * @param x **x**
	 * @param y **y**
	 */
	public void point(int x, int y) {
	this.x = x;
	this.y = y;
	}
		/**
	 * getX.
	 * @return **getX**
	 */
	public int getX() {
	return this.x;
	}
		/**
	 * getY.
	 * @return **getY**
	 */
	public int getY() {
	return this.y;
	}
		/**
	 * is.
	 * @param a **a**
	 * @param b **b**
	 * @return **is**
	 */
	public boolean is(int a, int b) {
	return (a * this.x + b == this.y);
	}
}