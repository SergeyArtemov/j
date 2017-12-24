package ru.job4j.chess;


/**
 * OccupiedWayException class.
 *
 * @author Sergey Artemov
 * @since 01.10.2017
 * @version 1
 */
public class OccupiedWayException extends RuntimeException {
    /**
     *
     * @param msg ****
     */
    public OccupiedWayException(String msg) {
        super(msg);
    }
}