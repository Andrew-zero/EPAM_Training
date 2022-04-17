package by.epam.introduction_to_java.basic.modul05.Task05.service.command;

import by.epam.introduction_to_java.basic.modul05.Task05.service.command.interface1.Command;

public class BouquetTwoCommand implements Command {
    private Bouquet bouquet;

    public BouquetTwoCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public void execute() {
        bouquet.makeCompositionTwo();
    }
}
