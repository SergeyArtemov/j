package ru.job4j.models;

/**
 * StubInput. Поточный ввод.
 *
 * @author Sergey Artemov
 * @since 05.08.1974
 * @version 1
 */
public class StubInput implements Input {
    /**
     * Поток, эмулирующий ответы пользователя.
     */
    private String[] answers;
    /**
     * Позиция в потоке ответов.
     */
    private int position = 0;
    /**
     * Конструктор класса.
     * @param answers **answers**
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }
    /**
     *
     * @param questions **вопрос (из нескольких пунктов)**
     * @return ****
     */
    public String ask(String[] questions) {
        return answers[position++];
    }

    /**
     *
     * @param question **вопрос (из одного пункта)**
     * @return ****
     */
    public String ask(String question) {
        return answers[position++];
    }

    public int ask(String question, int[] range) {
        return Integer.valueOf(answers[position++]);
    }
}
