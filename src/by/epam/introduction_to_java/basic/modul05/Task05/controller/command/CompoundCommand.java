package by.epam.introduction_to_java.basic.modul05.Task05.controller.command;


import by.epam.introduction_to_java.basic.modul05.Task05.controller.Shop;
import by.epam.introduction_to_java.basic.modul05.Task05.controller.command.interface1.Command;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.BouquetType;

import java.util.HashMap;
import java.util.Map;

public class CompoundCommand {
    private Map<BouquetType, Command> commandMap = new HashMap<>();
    private Shop shop;

    {
        commandMap.put(BouquetType.ONE, new BouquetOneCommand(shop));
        commandMap.put(BouquetType.TWO, new BouquetTwoCommand(shop));
        commandMap.put(BouquetType.THREE, new BouquetThreeCommand(shop));
    }

    public CompoundCommand() {
    }

    public CompoundCommand(Shop shop) {
        this.shop = shop;
    }

    public Bouquet executeCommand(BouquetType type) {
        return commandMap.get(type).execute();
    }

}
