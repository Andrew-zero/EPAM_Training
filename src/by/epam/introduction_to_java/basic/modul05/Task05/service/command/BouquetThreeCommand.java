package by.epam.introduction_to_java.basic.modul05.Task05.service.command;

import by.epam.introduction_to_java.basic.modul05.Task05.service.command.interface1.Command;

public class BouquetThreeCommand implements Command {
    private FlowerComposition flowerComposition;

    public BouquetThreeCommand(FlowerComposition flowerComposition) {
        this.flowerComposition = flowerComposition;
    }

    @Override
    public void execute() {
        flowerComposition.makeCompositionThree();
    }
}
