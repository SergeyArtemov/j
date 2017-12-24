package ru.job4j.shapes;

/**
 * Класс для рисования фигур Paint.
 * @author Sergey Artemov
 * @since 12.08.2017
 * @version 1
 */
public class Paint {
    /**
     *
     * @param shape ****
     */
    public void draw(Shape shape) {
        String s = shape.pic();
        System.out.print(s);
    }
}
