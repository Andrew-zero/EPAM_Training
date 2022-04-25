package by.epam.introduction_to_java.basic.modul05.Task05.controller;

import by.epam.introduction_to_java.basic.modul05.Task05.controller.command.CompoundCommand;
import by.epam.introduction_to_java.basic.modul05.Task05.dao.DaoCommander;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.BouquetType;
import by.epam.introduction_to_java.basic.modul05.Task05.view.View;

public class BouquetController {
    private View view;
    private DaoCommander daoCommander;
    private CompoundCommand command = new CompoundCommand();

    public BouquetController() {
    }

    public BouquetController(View view, DaoCommander daoCommander) {
        this.view = view;
        this.daoCommander = daoCommander;
    }

    public Bouquet createBouquet(BouquetType type) {
        return command.executeCommand(type);
    }


}
