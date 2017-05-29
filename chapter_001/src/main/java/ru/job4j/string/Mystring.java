package ru.job4j.string;
//import java.lang.String;
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
		char[] or = origin.toCharArray();
		char[] sb = sub.toCharArray();
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