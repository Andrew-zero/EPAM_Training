package by.epam.introduction_to_java.basic.modul05.Task05.controller.command;

import by.epam.introduction_to_java.basic.modul05.Task05.controller.command.interface1.Command;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;

public class BouquetOneCommand implements Command {
    private BouquetCreator bouquet;

    public BouquetOneCommand(BouquetCreator bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public Bouquet execute() {
        return bouquet.makeCompositionOne();
    }
}
