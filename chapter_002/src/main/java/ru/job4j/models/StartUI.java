package ru.job4j.models;

import java.text.*;

/**
 * StartUI. Стартовый класс.
 *
 * @author Sergey Artemov
 * @since 12.07.2017
 * @version 1
 */
public class StartUI {
    static final String ADDNEW = "0";
    static final String SHOWALL = "1";
    static final String EDIT = "2";
    static final String DELETE = "3";
    static final String FINDBYID = "4";
    static final String FINDBYNAME = "5";
    static final String EXIT = "6";
    private Item[] item11; // текущие выводимые заявки
    private Item item1; // текущая заявка
    private Tracker track = new Tracker();
    private ConsoleInput consInp = new ConsoleInput(); // класс консольного ввода
    private String resInp = ""; // временное хранение текущего ответа
    private int i; // счетчик
    private SimpleDateFormat f1 = new SimpleDateFormat("dd.MM.yy hh:mm"); //формат даты-времени

    public static void main (String[] args) {
        StartUI startUI = new StartUI();
        startUI.Start();
    }

    /**
     *Start. Запуск.
     *@return **void**
     */
    public void Start(){
        String[] quest = {"0. Add new Item",
                "1. Show all items",
                "2. Edit item",
                "3. Delete item",
                "4. Find item by Id",
                "5. Find items by name",
                "6. Exit Program",
                "Select:"}; // меню

        while (!resInp.equals(EXIT)) {
            resInp = consInp.ask(quest);
            if (resInp.equals(ADDNEW)){
                AddNew();
            } else
            if (resInp.equals(SHOWALL)){
                ShowAll();
            } else
            if (resInp.equals(EDIT)){
                Edit();
            } else
            if (resInp.equals(DELETE)){
                Delete();
            } else
            if (resInp.equals(FINDBYID)){
                FindByID();
            } else
            if (resInp.equals(FINDBYNAME)){
                FindByName();
            }
        }
    }

    /**
     *AddNew. Добавление новой записи.
     *@return **void**
     */
    private void AddNew(){
        item1 = new Item();
        resInp = consInp.ask("name for the new item:");
        item1.name = resInp;
        resInp = consInp.ask("description for the new item:");
        item1.description = resInp;
        item1.create = System.currentTimeMillis();
        track.add(item1);
    }

    /**
     *ShowAll. Выдача всех заявок.
     *@return **void**
     */
    private void ShowAll(){
        item11 = track.findAll();
        System.out.print("name"+"\t");
        System.out.print("description"+"\t");
        System.out.print("CreateDateTime"+"\t");
        System.out.print("id"+"\r\n");

        for (i = 0; i < item11.length;i++){
            System.out.print(item11[i].getName()+"\t");
            System.out.print(item11[i].getDescription()+"\t");
            System.out.print(f1.format(item11[i].getCreate())+"\t");
            System.out.print(item11[i].getId()+"\r\n");
        }
        resInp = consInp.ask("Press any key....");
        resInp = "";
    }

    /**
     *Edit. Редактирование записи.
     *@return **void**
     */
    private void Edit(){
        resInp = consInp.ask("Input ID of the item:");
        item1 = track.findById(resInp);
        if (item1 == null){
            System.out.print("No item with this id"+"\r\n");
        }else {
            resInp = consInp.ask("Old name:" + item1.getName() + "  New name:");
            item1.name = resInp;
            resInp = consInp.ask("Old description:" + item1.getDescription() + "  New description:");
            item1.description = resInp;
            track.update(item1);
        }
    }

    /**
     *Delete. Удаление записи.
     *@return **void**
     */
    private void Delete(){
        resInp = consInp.ask("Input ID of the item for deleting:");
        item1 = track.findById(resInp);
        if (item1 == null){
            System.out.print("No item with this id"+"\r\n");
        }else {
            track.delete(item1);
        }
    }


    /**
     *FindByID. Найти по ID.
     *@return **void**
     */
    private void FindByID(){
        resInp = consInp.ask("Input ID of the item to find:");
        item1 = track.findById(resInp);
        if (item1 == null){
            System.out.print("No item with this id"+"\r\n");
        }else {
            System.out.print("name: " + item1.getName() + "\t");
            System.out.print("description:" + item1.getDescription() + "\t");
            System.out.print("datetime:" + f1.format(item1.getCreate()) + "\t");
            System.out.print("id:" + item1.getId() + "\r\n");
            resInp = consInp.ask("Press any key....");
            resInp = "";
        }
    }


    /**
     *FindByName. Найти по Name.
     *@return **void**
     */
    private void FindByName(){
        resInp = consInp.ask("Input name of the item to find:");
        item1 = track.findByName(resInp);
        if (item1 == null){
            System.out.print("No  item with this name"+"\r\n");
        }else {
            System.out.print("name: " + item1.getName()+"\t");
            System.out.print("description:" + item1.getDescription()+"\t");
            System.out.print("datetime:" + f1.format(item1.getCreate())+"\t");
            System.out.print("id:" + item1.getId()+ "\r\n");
            resInp = consInp.ask("Press any key....");
            resInp = "";
        }
    }

}
