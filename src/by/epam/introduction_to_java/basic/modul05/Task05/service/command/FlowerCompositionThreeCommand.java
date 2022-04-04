package by.epam.introduction_to_java.basic.modul05.Task05.service.command;

import by.epam.introduction_to_java.basic.modul05.Task05.model.FlowerCompositionThree;
import by.epam.introduction_to_java.basic.modul05.Task05.service.command.interface1.Command;

public class FlowerCompositionThreeCommand implements Command {
    private FlowerCompositionThree flowerCompositionThree;

    public FlowerCompositionThreeCommand(FlowerCompositionThree flowerCompositionThree) {
        this.flowerCompositionThree = flowerCompositionThree;
    }

    @Override
    public void execute() {
        flowerCompositionThree.makeComposition();
    }
}
