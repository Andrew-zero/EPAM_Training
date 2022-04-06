package by.epam.introduction_to_java.basic.modul05.Task05.controller.command;


import by.epam.introduction_to_java.basic.modul05.Task05.controller.command.interface1.Command;

import java.util.HashMap;
import java.util.Map;

public class CompoundCommand {
    private Map<Integer, Command> commandMap = new HashMap<>();
    private FlowerComposition flowerComposition;

    public CompoundCommand(FlowerComposition flowerComposition) {
        this.flowerComposition = flowerComposition;
    }

    //1 - firstComposition
    //2 - secondComposition
    //3 - thirdComposition
    public void init() {
        commandMap.put(1, new FlowerCompositionOneCommand(flowerComposition));
        commandMap.put(2, new FlowerCompositionOneCommand(flowerComposition));
        commandMap.put(3, new FlowerCompositionOneCommand(flowerComposition));
    }

    public void executeCommand(int numberCommand){
        commandMap.get(numberCommand).execute();
    }

}
