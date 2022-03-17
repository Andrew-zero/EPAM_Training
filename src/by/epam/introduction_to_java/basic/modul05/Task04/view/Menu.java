package by.epam.introduction_to_java.basic.modul05.Task04.view;

import by.epam.introduction_to_java.basic.modul05.Task04.bean.Treasure;
import by.epam.introduction_to_java.basic.modul05.Task04.service.Logic;

import java.util.List;

public class Menu {
    private Logic logicTreasure;
    private View view;

    public Menu() {
    }

    public Menu(Logic logicTreasure, View view) {
        this.logicTreasure = logicTreasure;
        this.view = view;
    }

    public int inputChoiceMenu() {
        String message = "Выберите номер меню: -> ";
        String menuMessage =
                """
                        0 - Просмотр всех сокровищ;
                        1 - Выбор самого дорогого по стоимости сокровища;
                        2 - Выбор сокровищ на заданную сумму.""";

        view.printMessage(message);
        view.printMessage(menuMessage);

        return view.inputNumber();
    }

    public void choiceMenu(int menuNumber) {
        switch (menuNumber) {
            case 0 -> viewTreasure();
            case 1 -> choiceMostExpensiveTreasure();
            case 2 -> choiceTreasureToTheFullest();
        }
    }

    public void viewTreasure() {
        view.printTreasureList(logicTreasure.getAllTreasure());
    }

    public void choiceMostExpensiveTreasure() {
        view.printTreasure(logicTreasure.getMostExpensive());
    }

    public void choiceTreasureToTheFullest() {
        List<Treasure> treasureList;
        String message = "Введите общую сумму, в виде целого числа: -> ";

        view.printMessage(message);

        int amount = view.inputNumber();
        treasureList = logicTreasure.treasureToTheFullest(amount);

        view.printTreasureList(treasureList);
    }
}

