package ru.job4j.models;

/**
 * MenuOutException Класс Исключение
 *
 * @Author Sergey Artemov
 * @Since 06.09.2017.
 * @Version 1
 *
 */
public class MenuOutException extends RuntimeException {
    /**
     * Конструктор.
     * @param msg **сообщение, выводимое при возникновении исключения**
     */
    public MenuOutException (String msg) {
        super(msg);
    }
}
