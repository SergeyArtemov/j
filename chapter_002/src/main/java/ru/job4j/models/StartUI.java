package ru.job4j.models;

/**
 * StartUI. Стартовый класс.
 *
 * @author Sergey Artemov
 * @since 31.07.2017
 * @version 2
 */
public class StartUI {

    /**
     *
     */
    private Tracker track;

    /**
     * Поток ввода.
     */
    private Input input;

    /**
     *
     * @param tracker **трекер**
     * @param input **поток ввода**
     */
    public StartUI(Tracker tracker, Input input) {
        this.track = tracker;
        this.input = input;
    }
    /**
     *
     * @param args **args**
     */
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        ConsoleInput input = new ConsoleInput(); // класс консольного ввода
        StartUI startUI = new StartUI(tracker, input);
        startUI.start();
    }


    /**
     *Start. Запуск.
     */
    public void start() {
        MenuTracker menu = new MenuTracker(this.input, this.track);
        menu.fillActions();
        int key;
        do {
            menu.Show();
            key = Integer.valueOf(input.ask("Select:"));
            //System.out.print(key);
            menu.select(key);
        } while( key != 6 && !"y".equals(this.input.ask("Exit?(y)")));

    }

}
