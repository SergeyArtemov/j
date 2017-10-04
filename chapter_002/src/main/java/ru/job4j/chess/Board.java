package ru.job4j.chess;

/**
 * Board class.
 *
 * @author Sergey Artemov
 * @since 01.10.2017
 * @version 1
 */
public class Board {
    Figure[] figures;
    Figure figure0;
    Cell[] way0;
    int number = 0;
    int i = 0, j = 0;
    boolean f; //флаг

    // Конструктор
    public Board() {
        number = 0;
        figures = new Figure[32];
        // Белый слон
        figures[number] = new Bishop();
        figures[number].color = 0; // белый
        figures[number].position.x = 3;
        figures[number].position.y = 1;
        number++;

        // Белый слон
        figures[number] = new Bishop();
        figures[number].color = 0; // белый
        figures[number].position.x = 6;
        figures[number].position.y = 1;
        number++;
    }

    /**
     *
     * @param source **source cell**
     * @param dist **distination cell**
     * @return **it's possible move, or not**
     * @throws ImpossibleMoveException
     * @throws OccupiedWayException
     * @throws FigureNotFoundException
     */
    boolean move(Cell source, Cell dist) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        // Находим фигуру в массиве фигур
        i = 0;
        while (i < number) {
            if (figures[i].position.x == source.x && figures[i].position.y == source.y) {
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
            while (way0[i].x != 0 && way0[i].y != 0) {
                // Проверим не заняты ли ячейки
                j = 0;
                while (j < number) {
                    if (way0[i].x == figures[j].position.x
                            && way0[i].y == figures[j].position.y) {
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
