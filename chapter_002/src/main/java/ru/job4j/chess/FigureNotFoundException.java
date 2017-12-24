package ru.job4j.chess;


/**
 * FigureNotFoundException class.
 *
 * @author Sergey Artemov
 * @since 01.10.2017
 * @version 1
 */
public class FigureNotFoundException extends RuntimeException {
    /**
     *
     * @param msg ****
     */
    public FigureNotFoundException(String msg) {
        super(msg);
    }
}