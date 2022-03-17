package by.epam.introduction_to_java.basic.modul05.Task04.service;


//Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
//        дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
//        выбора сокровищ на заданную сумму.

import by.epam.introduction_to_java.basic.modul05.Task04.bean.Dragon;
import by.epam.introduction_to_java.basic.modul05.Task04.bean.Treasure;
import by.epam.introduction_to_java.basic.modul05.Task04.dao.DataBaseReader;
import by.epam.introduction_to_java.basic.modul05.Task04.dao.DataBaseReaderImpl;
import by.epam.introduction_to_java.basic.modul05.Task04.dao.DataBaseWriterImpl;
import by.epam.introduction_to_java.basic.modul05.Task04.service.comparator.TreasurePriceComparator;
import by.epam.introduction_to_java.basic.modul05.Task04.view.View;

import java.util.ArrayList;
import java.util.List;

public class LogicTreasure {
    private DataBaseReader dataBaseReader = new DataBaseReaderImpl();
    private DataBaseWriterImpl dataBaseWriter = new DataBaseWriterImpl();
    private View view = new View();

    private final String treasureFileName = view.inputFileName();
    private final String dragonFileName = view.inputFileName();

    public LogicTreasure() {
    }

    public List<Treasure> getAllTreasure() {

        return readTreasureFromFile(treasureFileName);
    }

    public Dragon getDragon(){

        return readDragonFromFile(dragonFileName);
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
        List<Treasure> treasureList = getAllTreasure();
        treasureList.add(treasure);

        writeTreasureInFile(treasureFileName, treasureList);
    }

    public boolean removeTreasure(Treasure treasure) {
        List<Treasure> treasureList = getAllTreasure();
        boolean result = treasureList.remove(treasure);

        writeTreasureInFile(treasureFileName, treasureList);
        return result;
    }

    public boolean removeListTreasure(List<Treasure> treasureList) {
        List<Treasure> treasureList1 = getAllTreasure();

        return treasureList1.removeAll(treasureList);
    }

    public List<Treasure> readTreasureFromFile(String fileName){

        return dataBaseReader.readAllTreasure(fileName);
    }

    public void writeTreasureInFile(String fileName, List<Treasure> treasureList){
        dataBaseWriter.writeTreasure(fileName, treasureList);
    }

    public Dragon readDragonFromFile(String fileName){

        return dataBaseReader.readDragon(fileName);
    }

    public void writeDragonInFile(String fileName, Dragon dragon){
        dataBaseWriter.writeDragon(fileName, dragon);
    }

}
