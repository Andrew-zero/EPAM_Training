package by.epam.introduction_to_java.basic.modul05.Task05.service.command;

import by.epam.introduction_to_java.basic.modul05.Task05.service.command.interface1.Command;

public class BouquetTwoCommand implements Command {
    private FlowerComposition flowerComposition;

    public BouquetTwoCommand(FlowerComposition flowerComposition) {
        this.flowerComposition = flowerComposition;
    }

    @Override
    public void execute() {
        flowerComposition.makeCompositionTwo();
    }
}
