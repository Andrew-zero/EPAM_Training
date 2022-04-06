package by.epam.introduction_to_java.basic.modul05.Task05.controller.command;

import by.epam.introduction_to_java.basic.modul05.Task05.controller.command.interface1.Command;

public class FlowerCompositionOneCommand implements Command {
    private FlowerComposition flowerComposition;

    public FlowerCompositionOneCommand(FlowerComposition flowerComposition) {
        this.flowerComposition = flowerComposition;
    }

    @Override
    public void execute() {
        flowerComposition.makeCompositionOne();
    }
}
