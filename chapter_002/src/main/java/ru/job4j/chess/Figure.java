package ru.job4j.chess;

/**
 * Abstract class Figure.
 *
 * @author Sergey Artemov
 * @since 01.10.2017
 * @version 1
 */
public abstract class Figure {
    /**
     * Конструктор
     */
    public Figure() {
        this.position = new Cell();
    }

    /**
     * Position on board.
     */
    public Cell position;
    /**
     * Color of bishop
     */
    public int color; // цвет 0 - белый, 1 - черный

    /**
     *
     * @param dist **where we want to set the figure**
     * @return **array of cell that we go through**
     * @throws ImpossibleMoveException **wrong move of bishop **
     */
    public abstract Cell[] way(Cell dist) throws ImpossibleMoveException;

    /**
     *
     * @param dist **set the figure on the position**
     * @return **the figure**
     */
    public Figure clone(Cell dist){
        position.x = dist.x;
        position.y = dist.y;
        return this;
    }
}
