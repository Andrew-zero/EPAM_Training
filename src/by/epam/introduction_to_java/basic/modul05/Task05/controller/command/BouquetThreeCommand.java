package by.epam.introduction_to_java.basic.modul05.Task05.controller.command;

import by.epam.introduction_to_java.basic.modul05.Task05.controller.command.interface1.Command;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.bouquet.Shop;

public class BouquetThreeCommand implements Command {
    private Shop bouquet;

    public BouquetThreeCommand(Shop bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public Bouquet execute() {
        return bouquet.makeCompositionThree();
    }
}
