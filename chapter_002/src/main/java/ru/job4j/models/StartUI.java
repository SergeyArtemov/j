package ru.job4j.models;

import java.text.SimpleDateFormat;

/**
 * StartUI. Стартовый класс.
 *
 * @author Sergey Artemov
 * @since 12.07.2017
 * @version 1
 */
public class StartUI {
    /**
     *
     */
    static final String ADDNEW = "0";
    /**
     *
     */
    static final String SHOWALL = "1";
    /**
     *
     */
    static final String EDIT = "2";
    /**
     *
     */
    static final String DELETE = "3";
    /**
     *
     */
    static final String FINDBYID = "4";
    /**
     *
     */
    static final String FINDBYNAME = "5";
    /**
     *
     */
    static final String EXIT = "6";

    /**
     *
     */
    private Item item1; // текущая заявка
    /**
     *
     */
    private Item[] item11; // текущие выводимые заявки
    /**
     *
     */
    private Tracker track;
    /**
     *
     */
    private String resInp = ""; // временное хранение текущего ответа
    /**
     *
     */
    private int i; // счетчик
    /**
     *
     */
    private SimpleDateFormat f1 = new SimpleDateFormat("dd.MM.yy hh:mm"); //формат даты-времени
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
        String[] quest = {"0. Add new Item",
                "1. Show all items",
                "2. Edit item",
                "3. Delete item",
                "4. Find item by Id",
                "5. Find items by name",
                "6. Exit Program",
                "Select:"}; // меню

        while (!resInp.equals(EXIT)) {
            resInp = input.ask(quest);
            if (resInp.equals(ADDNEW)) {
                addNew();
            } else
            if (resInp.equals(SHOWALL)) {
                showAll();
            } else
            if (resInp.equals(EDIT)) {
                edit();
            } else
            if (resInp.equals(DELETE)) {
                delete();
            } else
            if (resInp.equals(FINDBYID)) {
                findByID();
            } else
            if (resInp.equals(FINDBYNAME)) {
                findByName();
            }
        }
    }

    /**
     *AddNew. Добавление новой записи.
     */
    private void addNew() {
        item1 = new Item();
        resInp = input.ask("name for the new item:");
        item1.setName(resInp);
        resInp = input.ask("description for the new item:");
        item1.setDescription(resInp);
        item1.setCreate(System.currentTimeMillis());
        track.add(item1);
    }

    /**
     *ShowAll. Выдача всех заявок.
     */
    private void showAll() {
        item11 = track.findAll();
        System.out.print("name" + "\t");
        System.out.print("description" + "\t");
        System.out.print("CreateDateTime" + "\t");
        System.out.print("id" + "\r\n");

        for (i = 0; i < item11.length; i++) {
            System.out.print(item11[i].getName() + "\t");
            System.out.print(item11[i].getDescription() + "\t");
            System.out.print(f1.format(item11[i].getCreate()) + "\t");
            System.out.print(item11[i].getId() + "\r\n");
        }
        resInp = input.ask("Press any key....");
        resInp = "";
    }

    /**
     *Edit. Редактирование записи.
     */
    private void edit() {
        resInp = input.ask("Input ID of the item:");
        item1 = track.findById(resInp);
        if (item1 == null) {
            System.out.print("No item with this id" + "\r\n");
        } else {
            resInp = input.ask("Old name:" + item1.getName() + "  New name:");
            item1.setName(resInp);
            resInp = input.ask("Old description:" + item1.getDescription() + "  New description:");
            item1.setDescription(resInp);
            track.update(item1);
        }
    }

    /**
     *Delete. Удаление записи.
     */
    private void delete() {
        resInp = input.ask("Input ID of the item for deleting:");
        item1 = track.findById(resInp);
        if (item1 == null) {
            System.out.print("No item with this id" + "\r\n");
        } else {
            track.delete(item1);
        }
    }


    /**
     *FindByID. Найти по ID.
     */
    private void findByID() {
        resInp = input.ask("Input ID of the item to find:");
        item1 = track.findById(resInp);
        if (item1 == null) {
            System.out.print("No item with this id" + "\r\n");
        } else {
            System.out.print("name: " + item1.getName() + "\t");
            System.out.print("description:" + item1.getDescription() + "\t");
            System.out.print("datetime:" + f1.format(item1.getCreate()) + "\t");
            System.out.print("id:" + item1.getId() + "\r\n");
            resInp = input.ask("Press any key....");
            resInp = "";
        }
    }


    /**
     *FindByName. Найти по Name.
     */
    private void findByName() {
        resInp = input.ask("Input name of the item to find:");
        item1 = track.findByName(resInp);
        if (item1 == null) {
            System.out.print("No  item with this name" + "\r\n");
        } else {
            System.out.print("name: " + item1.getName() + "\t");
            System.out.print("description:" + item1.getDescription() + "\t");
            System.out.print("datetime:" + f1.format(item1.getCreate()) + "\t");
            System.out.print("id:" + item1.getId() + "\r\n");
            resInp = input.ask("Press any key....");
            resInp = "";
        }
    }

}
