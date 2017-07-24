package ru.job4j.models;

import java.util.*;

/**
 * ConsoleInput. Класс консольного ввода-вывода.
 *
 * @author Sergey Artemov
 * @since 20.07.2017
 * @version 1
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);
    public String ask(String[] questions){
        for(int i = 0; i< questions.length; i++) {
            System.out.print(questions[i]+"\r\n");
        }
        return scanner.nextLine();
    }

    public String ask(String question){
              System.out.print(question);
         return scanner.nextLine();
    }
}
