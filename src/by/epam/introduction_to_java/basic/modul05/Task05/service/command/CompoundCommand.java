package by.epam.introduction_to_java.basic.modul05.Task05.service.command;


import by.epam.introduction_to_java.basic.modul05.Task05.service.command.interface1.Command;

import java.util.HashMap;
import java.util.Map;

public class CompoundCommand {
    private Map<Integer, Command> commandMap = new HashMap<>();
    private FlowerComposition flowerComposition;

    public CompoundCommand(Map<Integer, Command> commandMap) {
        this.commandMap = commandMap;
    }

    //1 - firstComposition
    //2 - secondComposition
    //3 - thirdComposition
    public void init() {
        commandMap.put(1, new BouquetOneCommand(flowerComposition));
        commandMap.put(2, new BouquetOneCommand(flowerComposition));
        commandMap.put(3, new BouquetOneCommand(flowerComposition));
    }

    public void executeCommand(int numberCommand){
        commandMap.get(numberCommand).execute();
    }

}