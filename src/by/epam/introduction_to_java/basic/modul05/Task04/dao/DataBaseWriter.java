package by.epam.introduction_to_java.basic.modul05.Task04.dao;

import by.epam.introduction_to_java.basic.modul05.Task04.bean.Dragon;
import by.epam.introduction_to_java.basic.modul05.Task04.bean.Treasure;

import java.util.List;

public interface DataBaseWriter {
    boolean writeTreasure(String fileName, List<Treasure> treasure);
    boolean writeDragon(String fileName, Dragon dragon);
}
