package ru.job4j.chess;

/**
 * Bishop class.
 *
 * @author Sergey Artemov
 * @since 01.10.2017
 * @version 1
 */
public class Bishop extends Figure {
    /**
     * Конструктор.
     */
    public Bishop() {
        super();
    }

    /**
     *
     * @param dist **where we want to set the figure**
     * @return **array of cell that we go through**
     * @throws ImpossibleMoveException ****
     */
    public Cell[] way(Cell dist) throws ImpossibleMoveException {
        Cell[] cellway = new Cell[20];
        int dx = (dist.getX() - getPosition().getX()) / Math.abs(dist.getX() - getPosition().getX());
        int dy = (dist.getY() - getPosition().getY()) / Math.abs(dist.getY() - getPosition().getY());
        int ddx = Math.abs(dist.getX() - getPosition().getX());
        int ddy = Math.abs(dist.getY() - getPosition().getY());

        if (ddx != ddy) {
            throw new ImpossibleMoveException("ImpossibleMove");
        }
        for (int i = 0; i < ddx; i++) {
            cellway[i] = new Cell();
            cellway[i].setX(getPosition().getX() + i * dx);
            cellway[i].setY(getPosition().getY() + i * dy);
        }
        cellway[ddx] = new Cell();
        cellway[ddx].setX(0);
        cellway[ddx].setY(0);
        return cellway;
    }
}
