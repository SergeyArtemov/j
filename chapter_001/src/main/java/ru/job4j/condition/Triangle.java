package ru.job4j.condition;

//import java.lang.*;

/**
 * Triangle.
 *
 * @author sartemov
 * @since 04.05.2017
 * @version 1
 */
public class Triangle {
	/**
	 * a.
	 */
	private Point a;
	/**
	 * b.
	 */
	private Point b;
	/**
	 * c.
	 */
	private Point c;
	/**
	 * Triangle.
	 * @param a **a**
	 * @param b **b**
	 * @param c **c**
	 */
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/**
	 * area.
	 * @return **area**
	 */
	public double area() {
		double ab = distan(this.a, this.b);
		double bc = distan(this.b, this.c);
		double ac = distan(this.a, this.c);
		double p = (ab + bc + ac) / 2D;
		return (Math.sqrt(p * (p - ab) * (p - bc) * (p - ac)));
	}
	/**
	 * distan.
	 * @param a **a**
	 * @param b **b**
	 * @return  **расстояние между точками**
	 */
	 private double distan(Point a, Point b) {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2)  + Math.pow(a.getY() - b.getY(), 2));
	}
}