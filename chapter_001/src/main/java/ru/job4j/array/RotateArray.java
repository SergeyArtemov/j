package ru.job4j.array;
/**
*RotateArray. Поворот квадратного массива.
*/
public class RotateArray {
	/**
	*RotateArray. Поворот квадратного массива.
	*@param array **исходный массив**
	*@return **массив после поворота**
	*/
	public int[][] rotate(int[][] array) {
			int len = array.length; // длинна массива
			int m = len / 2 - 1; // условный пол длины массива
			int n = (len + 1) / 2 - 1; // условный пол длины массива
			int p; //временные переменные
			int q; //временные переменные
			for (int i = 0; i <= m; i++) {
				for (int j = i; j <= n; j++) {
					p = array[j][len - 1 - i];
					array[j][len - 1 - i] = array[i][j];
					q = array[len - 1 - i][len - 1 - j];
					array[len - 1 - i][len - 1 - j] = p;
					p = array[len - 1 - j][i];
					array[len - 1 - j][i] = q;
					array[i][j] = p;
				}
			}
			return array;
	}
}