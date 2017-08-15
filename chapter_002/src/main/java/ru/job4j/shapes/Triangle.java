package ru.job4j.shapes;

/**
 * Класс треугольник Triangle
 * @author Sergey Artemov
 * @since 12.08.2017
 * @version 1
 */
public class Triangle implements Shape {
    public String pic() {
        StringBuilder pic = new StringBuilder();
        pic.append("   *   ");
        pic.append("  * *  ");
        pic.append(" *   * ");
        pic.append("*******");
        return pic.toString();
    }
}
