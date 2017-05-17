package ru.job4j.array;
import java.util.Arrays;
//import java.io.PrintStream;
/**
*ArrayDuplicate. Удаление дубликатов записей в массиве.
*/
public class ArrayDuplicate {
	/**
	*remove. Удаление дубликатов.
	*@param array **исходный массив**
	*@return **массив после удаления дубликатов**
	*/
		public String[] remove(String[] array) {
			int len = array.length;
			String str;
			int p = 0; // кол-во дубликатов
			int i = 0;
			while (i <= len - 1 - p) {
				for (int j = 0; j <= i - 1; j++) {
					if (array[i].equals(array[j])) {
						str = array[i];
						for (int k = i; k <= len - 2 - p; k++) {
							array[k] = array[k + 1];
						}
						i--;
						array[len - 1 - p] = str;
						p++;
						break;
					}
				}
				i++;
			}
			return Arrays.copyOf(array, len - p);
		}

}