package by.epam.introduction_to_java.basic.modul05.Task05.controller.command;

import by.epam.introduction_to_java.basic.modul05.Task05.controller.command.interface1.Command;

public class FlowerCompositionThreeCommand implements Command {
    private FlowerComposition flowerComposition;

    public FlowerCompositionThreeCommand(FlowerComposition flowerComposition) {
        this.flowerComposition = flowerComposition;
    }

    @Override
    public void execute() {
        flowerComposition.makeCompositionThree();
    }
}
