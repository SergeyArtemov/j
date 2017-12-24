package ru.job4j.chess;

/**
 * Cell class.
 *
 * @author Sergey Artemov
 * @since 01.10.2017
 * @version 1
 */
public class Cell {

    /**
     *
     */
    private int x;
    /**
     *
     */
    private int y;

    /**
     *
     * @return ****
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @param x ****
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return ****
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @param y ****
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Конструктор.
     */
    public Cell() {
    }

    /**
     *
     * @param x ****
     * @param y ****
     */

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
