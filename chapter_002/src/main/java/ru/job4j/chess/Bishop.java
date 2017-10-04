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
     * Конструктор
     */
    public Bishop() {
        super();
    }

    /**
     *
     * @param dist **where we want to set the figure**
     * @return **array of cell that we go through**
     * @throws ImpossibleMoveException
     */
    public Cell[] way(Cell dist) throws ImpossibleMoveException {
        Cell[] cellway = new Cell[20];
        int dx = (dist.x - position.x) / Math.abs(dist.x - position.x);
        int dy = (dist.y - position.y) / Math.abs(dist.y - position.y);
        int ddx = Math.abs(dist.x - position.x);
        int ddy = Math.abs(dist.y - position.y);

        if (ddx != ddy) {
            throw new ImpossibleMoveException("ImpossibleMove");
        }
        for (int i = 0; i < ddx; i++) {
            cellway[i] = new Cell();
            cellway[i].x = position.x + i*dx;
            cellway[i].y = position.y + i*dy;
        }
        cellway[ddx] = new Cell();
        cellway[ddx].x = 0;
        cellway[ddx].y = 0;
        return cellway;
    }
}
