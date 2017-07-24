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
    public static void main (String[] args) {
        String resInp = ""; // временное хранение текущего ответа
        String[] quest = {"0. Add new Item",
                "1. Show all items",
                "2. Edit item",
                "3. Delete item",
                "4. Find item by Id",
                "5. Find items by name",
                "6. Exit Program",
                "Select:"}; // меню
        Item item1; // текущая заявка
        Item[] item11; // текущие выводимые заявки
        int i; // счетчик
        SimpleDateFormat f1 = new SimpleDateFormat("dd.MM.yy hh:mm"); //формат даты-времени
        ConsoleInput consInp = new ConsoleInput(); // класс консольного ввода
        Tracker track = new Tracker();
        while (!resInp.equals("6")) {
            resInp = consInp.ask(quest);
            if (resInp.equals("0")){
                item1 = new Item();
                resInp = consInp.ask("name for the new item:");
                item1.name = resInp;
                resInp = consInp.ask("description for the new item:");
                item1.description = resInp;
                item1.create = System.currentTimeMillis();
                track.add(item1);

            } else
                if (resInp.equals("1")){
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
                } else
                    if (resInp.equals("2")){
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
                    } else
                        if (resInp.equals("3")){
                            resInp = consInp.ask("Input ID of the item for deleting:");
                            item1 = track.findById(resInp);
                            if (item1 == null){
                                    System.out.print("No item with this id"+"\r\n");
                                }else {
                                track.delete(item1);
                                }
                        } else
                            if (resInp.equals("4")){
                                resInp = consInp.ask("Input ID of the item to find:");
                                item1 = track.findById(resInp);
                                if (item1 == null){
                                    System.out.print("No item with this id"+"\r\n");
                                }else {
                                    System.out.print("name: " + item1.getName()+"\t");
                                    System.out.print("description:" + item1.getDescription()+"\t");
                                    System.out.print("datetime:" + f1.format(item1.getCreate())+"\t");
                                    System.out.print("id:" + item1.getId()+"\r\n");
                                    resInp = consInp.ask("Press any key....");
                                    resInp = "";
                                }
                            } else
                                if (resInp.equals("5")){
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
    }
    //public void StartUI{
   // }
}
