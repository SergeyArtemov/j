package ru.job4j.models;

import java.text.SimpleDateFormat;

/**
 * MenuTracker. Класс меню.
 * @author Sergey Artemov
 * @since 24.08.2017
 * @version 1
 */

/**
 * EditItem Внешний класс - реализует редактирование элемента.
 */
class EditItem extends TemplateAction {
    /**
     *
     * @param key ****
     * @param name ****
     */
    EditItem(int key, String name) {
        super(key, name);
    }

    /**
     *
     * @return ****
     */
    public int key() {
        return this.getKey0();
    }

    /**
     *
     * @param input **ввод-вывод**
     * @param tracker **трекер**
     */
    public void execute(Input input, Tracker tracker) {
        String resInp = input.ask("Input ID of the item:");
        Item item1 = tracker.findById(resInp);
        if (item1 == null) {
            System.out.print("No item with this id" + "\r\n");
        } else {
            resInp = input.ask("Old name:" + item1.getName() + "  New name:");
            item1.setName(resInp);
            resInp = input.ask("Old description:" + item1.getDescription() + "  New description:");
            item1.setDescription(resInp);
            tracker.update(item1);
        }

    }

    /**
     *
     * @return **вывод меню на консоль**
     */
    //public String info() {
    //    return String.format("%s. %s",this.key(),"Edit item");
    //}
}

/**
 * MenuTracker. Класс меню.
 */
public class MenuTracker {
    /**
     *
     */
    private Input input;
    /**
     *
     */
    private Tracker tracker;
    /**
     *
     */
    private UserAction[] actions = new UserAction[10];

    /**
     *
     * @param input ****
     * @param tracker ****
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Наполнение массива меню actions[].
     */
    public void fillActions() {
        this.actions[0] = this.new AddItem(0, "Add new Item"); //внутренний класс
        this.actions[1] = new MenuTracker.ShowAllItems(1, "Show all items"); //внутренний статический класс
        this.actions[2] = new EditItem(2, "Edit item"); //внешний класс
        this.actions[3] = this.new DeleteItem(3, "Delete item");
        this.actions[4] = this.new FindById(4, "Find item by id");
        this.actions[5] = this.new FindByName(5, "Find item by name");
        this.actions[6] = this.new Exit(6, "Exit");
    }

    /**
     *
     * @param key **номер элемента в меню**
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    /**
     * Вывод на консоль меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * Внутренний класс операции "Добавление элемента".
     */
    private class AddItem extends TemplateAction {
        /**
         *
         * @param key ****
         * @param name ****
         */
        AddItem(int key, String name) {
            super(key, name);
        }

        /**
         *
         * @return ****
         */
        public int key() {
            return this.getKey0();
        }

        /**
         *
         * @param input **ввод-вывод**
         * @param tracker **трекер**
         */
        public void execute(Input input, Tracker tracker) {
            Item item1 = new Item();
            String resInp = input.ask("name for the new item:");
            item1.setName(resInp);
            resInp = input.ask("description for the new item:");
            item1.setDescription(resInp);
            item1.setCreate(System.currentTimeMillis());
            tracker.add(item1);
        }

        //public String info() {
        //    return String.format("%s. %s",this.key(),"Add new Item");
        //}
    }

    /**
     * Внутренний статический класс операции "Вывод на консоль всех элементов".
     */
    private static class ShowAllItems extends TemplateAction {
        /**
         *
         * @param key ****
         * @param name ****
         */
        ShowAllItems(int key, String name) {
            super(key, name);
        }

        /**
         *
         * @return ****
         */
        public int key() {
            return this.getKey0();
        }

        /**
         *
         * @param input **ввод-вывод**
         * @param tracker **трекер**
         */
        public void execute(Input input, Tracker tracker) {
            SimpleDateFormat f1 = new SimpleDateFormat("dd.MM.yy hh:mm"); //формат даты-времени
            //String resInp;

            Item[] item11 = tracker.findAll();
            System.out.print("name" + "\t");
            System.out.print("description" + "\t");
            System.out.print("CreateDateTime" + "\t");
            System.out.print("id" + "\r\n");

            for (int i = 0; i < item11.length; i++) {
                System.out.print(item11[i].getName() + "\t");
                System.out.print(item11[i].getDescription() + "\t");
                System.out.print(f1.format(item11[i].getCreate()) + "\t");
                System.out.print(item11[i].getId() + "\r\n");
            }
        }

        //public String info() {
        //    return String.format("%s. %s",this.key(),"Show all items");
        //}
    }

    /**
     * Внутренний класс операции "Удаление элемента".
     */
    private class DeleteItem extends TemplateAction {
        /**
         *
         * @param key ****
         * @param name ****
         */
        DeleteItem(int key, String name) {
            super(key, name);
        }

        /**
         *
         * @return ****
         */
        public int key() {
            return this.getKey0();
        }

        /**
         *
         * @param input **ввод-вывод**
         * @param tracker **трекер**
         */
        public void execute(Input input, Tracker tracker) {
            String resInp = input.ask("Input ID of the item for deleting:");
            Item item1 = tracker.findById(resInp);
            if (item1 == null) {
                System.out.print("No item with this id" + "\r\n");
            } else {
                tracker.delete(item1);
            }
        }

        //public String info() {
        //   return String.format("%s. %s",this.key(),"Delete item");
        //}
    }

    /**
     * Внутренний класс операции "Поиск по ID".
     */
    private class FindById extends TemplateAction {
        /**
         *
         * @param key ****
         * @param name ****
         */
        FindById(int key, String name) {
            super(key, name);
        }

        /**
         *
         * @return ****
         */
        public int key() {
            return this.getKey0();
        }

        /**
         *
         * @param input **ввод-вывод**
         * @param tracker **трекер**
         */
        public void execute(Input input, Tracker tracker) {
            SimpleDateFormat f1 = new SimpleDateFormat("dd.MM.yy hh:mm"); //формат даты-времени
            String resInp = input.ask("Input ID of the item to find:");
            Item item1 = tracker.findById(resInp);
            if (item1 == null) {
                System.out.print("No item with this id" + "\r\n");
            } else {
                System.out.print("name: " + item1.getName() + "\t");
                System.out.print("description:" + item1.getDescription() + "\t");
                System.out.print("datetime:" + f1.format(item1.getCreate()) + "\t");
                System.out.print("id:" + item1.getId() + "\r\n");
            }
        }
        //public String info() {
        //    return String.format("%s. %s", this.key(), "Find item by id");
        //}
    }

    /**
     * Внутренний класс операции "Поиск по имени".
     */
    private class FindByName extends TemplateAction {
        /**
         *
         * @param key ****
         * @param name ****
         */
        FindByName(int key, String name) {
            super(key, name);
        }

        /**
         *
         * @return ****
         */
        public int key() {
            return this.getKey0();
        }

        /**
         *
         * @param input **ввод-вывод**
         * @param tracker **трекер**
         */
        public void execute(Input input, Tracker tracker) {
            SimpleDateFormat f1 = new SimpleDateFormat("dd.MM.yy hh:mm"); //формат даты-времени
            String resInp = input.ask("Input name of the item to find:");
            Item item1 = tracker.findByName(resInp);
            if (item1 == null) {
                System.out.print("No  item with this name" + "\r\n");
            } else {
                System.out.print("name: " + item1.getName() + "\t");
                System.out.print("description:" + item1.getDescription() + "\t");
                System.out.print("datetime:" + f1.format(item1.getCreate()) + "\t");
                System.out.print("id:" + item1.getId() + "\r\n");

            }
        }

        //public String info() {
        //    return String.format("%s. %s", this.key(), "Find item by name");
        //}
    }

    /**
     * Внутренний класс операции "Exit".
     */
    private class Exit extends TemplateAction {
        /**
         *
         * @param key ****
         * @param name ****
         */
        Exit(int key, String name) {
            super(key, name);
        }

        /**
         *
         * @return ****
         */
        public int key() {
            return this.getKey0();
        }

        /**
         *
         * @param input **ввод-вывод**
         * @param tracker **трекер**
         */
        public void execute(Input input, Tracker tracker) {
        }

        //public String info() {
        //    return String.format("%s. %s",this.key(),"Exit");
        //}
    }

}

