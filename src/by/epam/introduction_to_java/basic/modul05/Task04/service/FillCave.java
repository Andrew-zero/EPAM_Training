package by.epam.introduction_to_java.basic.modul05.Task04.service;

import by.epam.introduction_to_java.basic.modul05.Task04.bean.*;

import java.util.ArrayList;
import java.util.List;

public class FillCave {
    private Logic logicTreasure = new Logic();
    private Cave cave = new Cave();

    public FillCave() {
    }

    public void fill() {
        List<Treasure> treasureList = new ArrayList<>();
        Dragon dragon;

        final int totalTreasure = 100;

        for (int i = 0; i < totalTreasure; i++) {
            String treasureName = "Treasure " + i;
            Type type;
            int price = (i + 100) / (13 - i % 4);

            if (i % 3 == 0) {
                type = Type.ORE;
            } else if (i % 3 == 1) {
                type = Type.ARTWORK;
            } else {
                type = Type.JEWEL;
            }

            treasureList.add(new Treasure(treasureName, type, price));
        }

        DragonProperty dragonProperty = new DragonProperty();
        dragonProperty.setAge(1000);
        dragonProperty.setLifeBar(2300);
        dragonProperty.setPower(400);
        dragonProperty.setSensitivity(80);

        dragon = new Dragon("OldDragon", dragonProperty);

        cave.setDragon(dragon);
        cave.setIsDragon(true);
        cave.setTreasureList(treasureList);
        cave.setIsTreasure(true);

        logicTreasure.writeTreasureInFile(logicTreasure.getTreasureFileName(), treasureList);
        logicTreasure.writeDragonInFile(logicTreasure.getDragonFileName(), dragon);
    }

    public Cave getCave() {
        return cave;
    }
}
