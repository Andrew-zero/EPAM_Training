package by.epam.introduction_to_java.basic.modul05.Task04.service.comparator;

import by.epam.introduction_to_java.basic.modul05.Task04.bean.Treasure;

import java.util.Comparator;

public class TreasurePriceComparator implements Comparator<Treasure> {
    @Override
    public int compare(Treasure o1, Treasure o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
