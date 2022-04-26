package by.epam.introduction_to_java.basic.modul05.Task05.controller.command;

import by.epam.introduction_to_java.basic.modul05.Task05.controller.command.interface1.Command;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.controller.Shop;

public class BouquetOneCommand implements Command {
    private Shop shop;

    public BouquetOneCommand(Shop shop) {
        this.shop = shop;
    }

    @Override
    public Bouquet execute() {
        return shop.makeCompositionOne();
    }
}
