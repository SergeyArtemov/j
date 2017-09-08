package ru.job4j.models;


/**
 * Input. Интерфейс ввода-вывода.
 *
 * @author Sergey Artemov
 * @since 20.07.2017
 * @version 1
 */
public interface Input {
    /**
     *
     * @param questions **questions**
     * @return ****
     */
    String ask(String[] questions);

    /**
     *
     * @param question **question**
     * @return ****
     */
    String ask(String question);

    /**
     *
     * @param question **question**
     * @param range **range of valid values**
     * @return
     */
    int ask(String question, int[] range);
}
