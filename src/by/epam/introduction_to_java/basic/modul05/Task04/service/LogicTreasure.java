package by.epam.introduction_to_java.basic.modul05.Task04.service;


//Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
//        дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
//        выбора сокровищ на заданную сумму.

import by.epam.introduction_to_java.basic.modul05.Task04.bean.Treasure;

import java.util.ArrayList;
import java.util.List;

public class LogicTreasure {
    private List<Treasure> treasureList = new ArrayList<>();

    public LogicTreasure() {
    }

    public List<Treasure> getAllTreasure() {

        return treasureList;
    }

    public Treasure getMostExpensive() {
        List<Treasure> treasureList = getAllTreasure();

        treasureList.sort(new TreasurePriceComparator());

        return treasureList.get(treasureList.size() - 1);
    }

    public List<Treasure> treasureToTheFullest(int amount) {
        List<Treasure> treasureList = getAllTreasure();
        List<Treasure> resultList = new ArrayList<>();

        treasureList.sort(new TreasurePriceComparator());
        int totalAmount = 0;

        for (Treasure treasure : treasureList) {
            if (totalAmount + treasure.getPrice() <= amount) {
                totalAmount += treasure.getPrice();

                resultList.add(treasure);
            }
        }

        return resultList;
    }

    public Treasure getTreasure(Treasure treasure) {
        List<Treasure> treasureList = getAllTreasure();
        Treasure result = null;

        for (Treasure treasure1 : treasureList) {
            if (treasure1.equals(treasure)) {
                result = treasure;
                break;
            }
        }

        return result;
    }

    public void addTreasure(Treasure treasure) {
        treasureList.add(treasure);
    }

    public boolean removeTreasure(Treasure treasure) {

        return treasureList.remove(treasure);
    }

    public boolean removeListTreasure(List<Treasure> treasureList) {

        return this.treasureList.removeAll(treasureList);
    }

}
