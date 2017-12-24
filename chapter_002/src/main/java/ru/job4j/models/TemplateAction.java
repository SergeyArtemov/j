package ru.job4j.models;

/**
 * TemplateAction. Базовый абстрактный класс для действий в трекере.
 * @author Sergey Artemov
 * @since 18.09.2017
 * @version 1
 */
public abstract class TemplateAction implements UserAction {
    /**
     *
     */
    private int key0;
    /**
     *
     */
    private String name;

    /**
     *
     * @param key **key**
     * @param name **name**
     */
    public TemplateAction(int key, String name) {
        this.key0 = key;
        this.name = name;
    }

    /**
     *
     * @return **ключ операции**
     */
    public int getKey0() {
        return key0;
    }

    /**
     *
     * @return ****
     */
    public abstract int key();

    /**
     *
     * @param input **ввод-вывод**
     * @param tracker **трекер**
     */
    public abstract void execute(Input input, Tracker tracker);

    /**
     *
     * @return **вывод на печать: номер пункта. наименование**
     */
    public String info() {
        return String.format("%s. %s", this.key(), this.name);
    }

}
