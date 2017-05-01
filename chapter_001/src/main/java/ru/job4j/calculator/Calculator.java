package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author sartemov
 * @since 01.05.2017
 * @version 1
 */
public class Calculator {
	/**
	 * result.
	 */
	private double result;
	/**
	 * Add.
	 * @param first **first**
	 * @param second **second**
	 */
	public void add(double first, double second) {
		this.result = first + second;
	}
	/**
	 * Substruct.
	 * @param first **first**
	 * @param second **second**
	 */
	public void substruct(double first, double second) {
		this.result = first - second;
	}
	/**
	 * Div.
	 * @param first **first**
	 * @param second **second**
	 */
	public void div(double first, double second) {
		this.result = first / second;
	}
	/**
	 * Multiple.
	 * @param first **first**
	 * @param second **second**
	 */
	public void multiple(double first, double second) {
		this.result = first * second;
	}
	/**
	 * getResult.
	 * @return **return**
	 */
	public double getResult() {
		return this.result;
	}
}