package by.epam.introduction_to_java.basic.modul06.Task04;

import java.util.ArrayList;
import java.util.List;

public class Harbor {

    private final int CONTAINER_CAPACITY = 200_000;

    private int id;
    private int[] containers = new int[CONTAINER_CAPACITY];


    List<Dock> dockList = new ArrayList<>();
    {
        dockList.add(new Dock());
        dockList.add(new Dock());
        dockList.add(new Dock());
    }
}
