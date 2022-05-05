package by.epam.introduction_to_java.basic.modul06.Task04;

public class Ship {

    private final int CONTAINER_COUNT = 7500;
    private final long LOAD_CAPACITY = 100_000; // total load capacity in ton

    private int id;
    private Container[] containers = new Container[CONTAINER_COUNT];

}
