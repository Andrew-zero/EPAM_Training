package by.epam.introduction_to_java.basic.modul05.Task05.service.command;

import by.epam.introduction_to_java.basic.modul05.Task05.model.FlowerCompositionTwo;
import by.epam.introduction_to_java.basic.modul05.Task05.service.command.interface1.Command;

public class FlowerCompositionTwoCommand implements Command {
    private FlowerCompositionTwo flowerCompositionTwo;

    public FlowerCompositionTwoCommand(FlowerCompositionTwo flowerCompositionTwo) {
        this.flowerCompositionTwo = flowerCompositionTwo;
    }

    @Override
    public void execute() {
        flowerCompositionTwo.makeComposition();
    }
}
