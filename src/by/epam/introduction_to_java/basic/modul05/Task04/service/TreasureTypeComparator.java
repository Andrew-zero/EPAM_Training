package by.epam.introduction_to_java.basic.modul05.Task04.service;

import by.epam.introduction_to_java.basic.modul05.Task04.bean.Treasure;

import java.util.Comparator;

public class TreasureTypeComparator implements Comparator<Treasure> {
    @Override
    public int compare(Treasure o1, Treasure o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
