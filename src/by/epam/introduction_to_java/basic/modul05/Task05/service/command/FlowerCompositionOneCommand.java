package by.epam.introduction_to_java.basic.modul05.Task05.service.command;

import by.epam.introduction_to_java.basic.modul05.Task05.model.FlowerCompositionOne;
import by.epam.introduction_to_java.basic.modul05.Task05.service.command.interface1.Command;

public class FlowerCompositionOneCommand implements Command {
    private FlowerCompositionOne flowerCompositionOne;

    public FlowerCompositionOneCommand(FlowerCompositionOne flowerCompositionOne) {
        this.flowerCompositionOne = flowerCompositionOne;
    }

    @Override
    public void execute() {
        flowerCompositionOne.makeComposition();
    }
}
