package ru.job4j.chess;



/**
 * ImpossibleMoveException class.
 *
 * @author Sergey Artemov
 * @since 01.10.2017
 * @version 1
 */
public class ImpossibleMoveException extends RuntimeException {
    /**
     *
     * @param msg ****
     */
    public ImpossibleMoveException(String msg) {
        super(msg);
    }
}
