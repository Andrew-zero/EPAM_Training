package by.epam.introduction_to_java.basic.modul05.Task05.service.command;

import by.epam.introduction_to_java.basic.modul05.Task05.service.command.interface1.Command;

public class BouquetThreeCommand implements Command {
    private BouquetMANY bouquet;

    public BouquetThreeCommand(BouquetMANY bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public void execute() {
        bouquet.makeCompositionThree();
    }
}
