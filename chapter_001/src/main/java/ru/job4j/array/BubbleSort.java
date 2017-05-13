package ru.job4j.array;
/**
*BubbleSort. сортировка пузырьком..
*/
public class BubbleSort {
	/**
	*Метод для сортировки Пузырьком.
	*@param array **исходный массив**
	*@return **отсортированный массив**
	*/
	public int[] sort(int[] array) {
		int len = array.length; // длина массива
		int p; //временная переменнная для хранения элементов массива
		for (int i = 0; i <= len - 2; i++) {
			for (int j = 0; j <= len - 2 - i; j++) {
				if (array[j] > array[j + 1]) {
					p = array[j];
					array[j] = array[j + 1];
					array[j + 1] = p;
				}
			}
		}
	return array;
	}
}
