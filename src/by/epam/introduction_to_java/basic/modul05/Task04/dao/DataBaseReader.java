package by.epam.introduction_to_java.basic.modul05.Task04.dao;

import by.epam.introduction_to_java.basic.modul05.Task04.bean.Dragon;
import by.epam.introduction_to_java.basic.modul05.Task04.bean.Treasure;

import java.util.List;

public interface DataBaseReader {
    List<Treasure> readAllTreasure(String fileName);
    Dragon readDragon(String fileName);
}
