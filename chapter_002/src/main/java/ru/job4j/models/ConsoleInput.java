package ru.job4j.models;

import java.util.Scanner;

/**
 * ConsoleInput. Класс консольного ввода-вывода.
 *
 * @author Sergey Artemov
 * @since 20.07.2017
 * @version 1
 */
public class ConsoleInput implements Input {
    /**
     *
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Метод ask.
     * @param questions **questions**
     * @return ****
     */
    public String ask(String[] questions) {
        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions[i] + "\r\n");
        }
        return scanner.nextLine();
    }

    /**
     * Метод ask.
     * @param question **question**
     * @return ****
     */
    public String ask(String question) {
              System.out.print(question);
         return scanner.nextLine();
    }

    /**
     * Метод ask.
     * @param question **question**
     * @param range **range of valid values**
     * @return
     */
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for(int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
            //return exist ? key : -1;
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("out of menu range");
        }

    }
}
