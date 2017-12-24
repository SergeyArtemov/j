package ru.job4j.models;

/**
 * MenuOutException Класс Исключение.
 *
 * @author Sergey Artemov
 * @since 06.09.2017.
 * @version 1
 *
 */
public class MenuOutException extends RuntimeException {
    /**
     * Конструктор.
     * @param msg **сообщение, выводимое при возникновении исключения**
     */
    public MenuOutException(String msg) {
        /**
         *
         */
        super(msg);
    }
}
