package ru.job4j.loop;
/**
*Paint. Рисование.
*/
public class Paint {
	/**
	*piramid. Метод для рисования пирамиды.
	*@param h **высота**
	*@return **пирамида**
	*/
	public String piramid(int h) {
		int w = (h - 1) * 2 + 1; // ширина пирамиды
		StringBuilder sb = new StringBuilder(); // здесь будем формировать пирамиду
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if ((j >= h - i + 1) && (j <= h + i - 1)) {
				sb.append("^");
				} else {
				sb.append(" ");
				}
			}
			if (i < h) {
			sb.append(System.getProperty("line.separator"));
			}
		}
	return sb.toString();
	}
}