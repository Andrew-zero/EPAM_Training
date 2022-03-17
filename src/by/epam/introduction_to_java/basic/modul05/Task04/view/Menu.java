package by.epam.introduction_to_java.basic.modul05.Task04.view;

import by.epam.introduction_to_java.basic.modul05.Task04.bean.Treasure;
import by.epam.introduction_to_java.basic.modul05.Task04.service.LogicTreasure;

import java.util.List;

public class Menu {
    private LogicTreasure logicTreasure;
    private View view;

    public Menu() {
    }

    public Menu(LogicTreasure logicTreasure, View view) {
        this.logicTreasure = logicTreasure;
        this.view = view;
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

