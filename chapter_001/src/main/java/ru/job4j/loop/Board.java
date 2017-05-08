package ru.job4j.loop;
/**
*Board. Шахматная доска.
*
*/
public class Board {
	/**
	*Метод для формирования доски.
	*@param width **ширина доски**
	*@param height **высота доски**
	*@return **доска**
	*/
	public String paint(int width, int height) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				sb.append((j % 2 == 0) ? ((i % 2 == 0) ? "x" : " ") : ((i % 2 == 0) ? " " : "x"));
			}
			sb.append(System.getProperty("line.separator"));
		}
		//System.out.println(StrngBuilder.toString());
		return sb.toString();
	}
}