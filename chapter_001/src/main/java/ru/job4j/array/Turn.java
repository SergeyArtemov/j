package ru.job4j.array;
/**
*Turn. Перевёртывание массива.
*/
public class Turn {
	/**
	*Метод для перевертывания массива.
	*@param array **исходный массив**
	*@return **перевернутый массив**
	*/
	public int[] back(int[] array) {
		int len = array.length;		// Длинна массива
		int m = len / 2 - 1; 		// Серединный элемент массива
		int p; 						// Переменная для временного хранения элемента массива
		for (int i = 0; i <= m; i++) {
			p = array[i];
			array[i] = array[len - i - 1];
			array[len - i - 1] = p;
		}
	return array;
	}
}
