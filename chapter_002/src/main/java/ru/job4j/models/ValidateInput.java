package ru.job4j.models;

/**
 *
 * ValidateInput Класс Валидированного ввода.
 * @author Sergey Artemov
 * @since 06.09.2017
 * @version 1
 */
public class ValidateInput extends  ConsoleInput {
    /**
     * Перегружаем метод ask.
     * @param question **вопрос**
     * @param range **диапозон допустимых числовых ответов**
     * @return ****
     */
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range); // обращаемся к методу ask родительского класса
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Введите номер пункта меню");
            } catch (NumberFormatException nfe) {
                System.out.println("Введите корректные данные");
            }
        } while (invalid);
        return value;
    }
}
