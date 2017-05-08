package ru.job4j.loop;
/**
*Factorial.
*
*/
public class Factorial {
	/**
	*factorial. метод расчета факториала.
	*@param n **входной параметр**
	*@return **значение факториала**
	*/
	public int calc(int n) {
	int res = 1; /*здесь будем накапливать результат*/
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
	return res;
	}
}
