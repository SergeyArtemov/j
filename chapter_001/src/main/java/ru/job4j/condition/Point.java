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
	 * getX.
	 * @return **getX**
	 */
	protected int getX() {
	return this.x;
	}
	/**
	 * getY.
	 * @return **getY**
	 */
	protected int getY() {
	return this.y;
	}
	/**
	 * Point.
	 * @param x **x**
	 * @param y **y**
	 */
	public Point(int x, int y) {
	this.x = x;
	this.y = y;
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