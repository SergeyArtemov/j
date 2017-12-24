package ru.job4j.moneychanger;

import java.util.Scanner;

/**
 * StartMoneyChanger.
 * @author SergeyArtemov
 * @since 24.09.2017
 * @version 1
 *
 */
public class StartMoneyChanger {
    /**
     *
     * @param args ****
     */
    public static void main(String[] args) {
        int s; // money for changing
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите денежную сумму:");

        s = Integer.valueOf(scan.nextLine());

        ChangeMoney changemoney = new ChangeMoney();
        System.out.print(changemoney.change(s));
    }
}
