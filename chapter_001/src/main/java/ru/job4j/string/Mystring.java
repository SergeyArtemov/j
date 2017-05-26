package ru.job4j.string;
/**
*Mystring.
*
*/
public class Mystring {
	/**
	*Метод для определения вхождения подстроки.
	*@param origin **исходная строка**
	*@param sub **подстрока**
	*@return **является ли подстрокой**
	*/
	public boolean contains(String origin, String sub) {
		int orLen = origin.length();
		int orSub = sub.length();
		boolean res = true;
		char[] or = new char[orLen];
		char[] sb = new char[orSub];
		for (int i = 0; i <= orLen - 1; i++) {
			or[i] = origin.charAt(i);
		}
		for (int i = 0; i <= orSub - 1; i++) {
			sb[i] = sub.charAt(i);
		}
		for (int i = 0; i <= orLen - orSub; i++) {
			res = true;
			for (int j = 0; j <= orSub - 1; j++) {
				if (or[i + j] != sb[j]) {
					res = false;
					break;
				}
			}
			if (res) {
				break;
			}
		}
	return res;
	}
}