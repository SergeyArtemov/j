package ru.job4j.chess;

/**
 * Board class.
 *
 * @author Sergey Artemov
 * @since 01.10.2017
 * @version 1
 */
public class Board {
    /**
     *
     */
    private Figure[] figures;
    /**
     *
     */
    private Figure figure0;
    /**
     *
     */
    private Cell[] way0;
    /**
     *
     */
    private int number = 0;
    /**
     *
     */
    private int i = 0, j = 0;
    /**
     *
     */
    private boolean f; //флаг

    /**
     * Конструктор.
     */
    public Board() {
        number = 0;
        figures = new Figure[32];
        // Белый слон
        figures[number] = new Bishop();
        figures[number].setColor(0); // белый
        figures[number].getPosition().setX(3);
        figures[number].getPosition().setY(1);
        number++;

        // Белый слон
        figures[number] = new Bishop();
        figures[number].setColor(0); // белый
        figures[number].getPosition().setX(6);
        figures[number].getPosition().setY(1);
        number++;
    }

    /**
     *
     * @param source **source cell**
     * @param dist **distination cell**
     * @return **it's possible move, or not**
     * @throws ImpossibleMoveException ****
     * @throws OccupiedWayException ****
     * @throws FigureNotFoundException ****
     */
    boolean move(Cell source, Cell dist) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        // Находим фигуру в массиве фигур
        i = 0;
        while (i < number) {
            if (figures[i].getPosition().getX() == source.getX() && figures[i].getPosition().getY() == source.getY()) {
                break;
            }
            i++;
        }

        if (i >= number) {
            // Не нашли фигуру, т.е. вышли за границы массива
            throw new FigureNotFoundException("FigureNotFound");
        } else {
            // Если фигура найдена.
            figure0 = figures[i];
            //try {
            way0 = figure0.way(dist);
            //} catch(ImpossibleMoveException ime) {

            //}

            // Проверим - возможно ли пройти по этому пути
            i = 1;
            f = false;
            while (way0[i].getX() != 0 && way0[i].getY() != 0) {
                // Проверим не заняты ли ячейки
                j = 0;
                while (j < number) {
                    if (way0[i].getX() == figures[j].getPosition().getX()
                            && way0[i].getY() == figures[j].getPosition().getY()) {
                        throw new OccupiedWayException("OccupiedWay");
                        //f = true; // позиция занята
                        //break;
                    }
                    j++;
                }
                i++;
            }
        }

        // Переместим фигуру
        figure0.clone(dist);

        return true;
    }
}
