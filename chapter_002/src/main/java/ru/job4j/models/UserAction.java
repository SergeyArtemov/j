package ru.job4j.models;

/**
 * UserAction Интерфейс Действий над трекером
 * @author Sergey Artemov
 * @since 24.08.217
 * @version 1
 */
public interface UserAction {
    /**
     *
     * @return **Значение ключа действия**
     */
    int key();

    /**
     *
     * @param input **ввод-вывод**
     * @param tracker **трекер**
     */
    void execute(Input input, Tracker tracker);

    /**
     *
     * @return **информация о Действии**
     */
    String info();
}
