package ru.job4j.shapes;

/**
 * Класс Квадрат Square
 * @author Sergey Artemov
 * @since 12.08.2017
 * @version 1
 */
public class Square implements Shape {
    public String pic() {
        StringBuilder pic = new StringBuilder();
        pic.append("****");
        pic.append("*  *");
        pic.append("*  *");
        pic.append("****");
        return pic.toString();

    }
}
