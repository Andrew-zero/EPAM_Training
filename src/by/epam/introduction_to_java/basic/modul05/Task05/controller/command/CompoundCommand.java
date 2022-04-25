package by.epam.introduction_to_java.basic.modul05.Task05.controller.command;


import by.epam.introduction_to_java.basic.modul05.Task05.controller.command.interface1.Command;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.bouquet.Shop;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.BouquetType;

import java.util.Map;

public class CompoundCommand {
    private Map<BouquetType, Command> commandMap;
    private Shop bouquet;

    public CompoundCommand() {
    }

    public CompoundCommand(Map<BouquetType, Command> commandMap) {
        this.commandMap = commandMap;
    }

    //1 - firstComposition
    //2 - secondComposition
    //3 - thirdComposition
    public void init() {
        commandMap.put(BouquetType.ONE, new BouquetOneCommand(bouquet));
        commandMap.put(BouquetType.TWO, new BouquetTwoCommand(bouquet));
        commandMap.put(BouquetType.THREE, new BouquetThreeCommand(bouquet));
    }

    public Bouquet executeCommand(BouquetType type) {
        return commandMap.get(type).execute();
    }

}
