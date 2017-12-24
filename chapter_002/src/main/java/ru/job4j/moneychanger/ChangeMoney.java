package ru.job4j.moneychanger;

/**
 * ChangeMoney.
 *
 * @author Sergey Artemov
 * @since 24.09.2017
 * @version 1
 */
public class ChangeMoney {
    /**
     *
     * @param s **money for changing**
     * @return **variants of changing**
     */
    public String change(int s) {
        String str = ""; // result string
        for (int s10 = s / 10; s10 >= 0; s10--) {
            for (int s5 = (s - s10 * 10) / 5; s5 >= 0; s5--) {
                str = str + "10-" + String.valueOf(s10) + " 5-" + String.valueOf(s5) + " 1-" + String.valueOf(s - s10 * 10 - s5 * 5) + "\r\n";
            }
        }
        return str;
    }
}
