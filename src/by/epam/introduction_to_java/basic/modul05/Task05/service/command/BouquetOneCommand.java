package by.epam.introduction_to_java.basic.modul05.Task05.service.command;

import by.epam.introduction_to_java.basic.modul05.Task05.service.command.interface1.Command;

public class BouquetOneCommand implements Command {
    private BouquetMANY bouquet;

    public BouquetOneCommand(BouquetMANY bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public void execute() {
        bouquet.makeCompositionOne();
    }
}
