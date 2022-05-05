package by.epam.introduction_to_java.basic.modul05.Task05.controller;

import by.epam.introduction_to_java.basic.modul05.Task05.controller.command.CompoundCommand;
import by.epam.introduction_to_java.basic.modul05.Task05.dao.DaoCommander;
import by.epam.introduction_to_java.basic.modul05.Task05.exception.ControllerException;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.BouquetType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;
import by.epam.introduction_to_java.basic.modul05.Task05.view.View;

public class BouquetController {
    private View view;
    private DaoCommander daoCommander;
    private CompoundCommand compoundCommand;

    public BouquetController() {
    }

    public BouquetController(View view, DaoCommander daoCommander, CompoundCommand compoundCommand) {
        this.view = view;
        this.daoCommander = daoCommander;
        this.compoundCommand = compoundCommand;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public DaoCommander getDaoCommander() {
        return daoCommander;
    }

    public void setDaoCommander(DaoCommander daoCommander) {
        this.daoCommander = daoCommander;
    }

    public CompoundCommand getCompoundCommand() {
        return compoundCommand;
    }

    public void setCompoundCommand(CompoundCommand compoundCommand) {
        this.compoundCommand = compoundCommand;
    }

    public Bouquet createBouquet(BouquetType type) {
        if (!checkProductAvailable(type)) {
            String message = "Не хватает материалов на букет %s. Пополните склад." + type;

            throw new ControllerException(message);
        }

        return compoundCommand.executeCommand(type);
    }

    /*
    Мы знаем что для каждого букета необходимо определённое количество цветов,
    для определения достаточного количества в хранилище сделаем внутренний класс валидатор
    BouquetType.ONE = FlowerType.ROSE (30 piece) + WrapType.PAPER (1 piece);
    BouquetType.TWO = FlowerType.TULIP (100 piece) + WrapType.CELLOPHANE (1 piece);
    BouquetType.THREE = FlowerType.PEONY (18 piece) + FlowerType.ROSE (36 piece) +  + WrapType.NYLON (1 piece);
    */

    public boolean checkProductAvailable(BouquetType type) {
        //0 - DaoFlower
        //1 - DaoWrap
        //2 - DaoBouquet

        switch (type) {
            case ONE -> {
                long count = daoCommander.getDao(0).count(FlowerType.ROSE);
                long count2 = daoCommander.getDao(1).count(WrapType.PAPER);

                if (count >= 30 && count2 >= 1) {
                    return true;
                } else {
                    view.print(FlowerType.ROSE + " " + count + "; " + WrapType.PAPER + " " + count2);
                }
            }
            case TWO -> {
                long count = daoCommander.getDao(0).count(FlowerType.TULIP);
                long count2 = daoCommander.getDao(1).count(WrapType.CELLOPHANE);

                if (count >= 100 && count2 >= 1) {
                    return true;
                } else {
                    view.print(FlowerType.TULIP + " " + count + "; " + WrapType.CELLOPHANE + " " + count2);
                }
            }
            case THREE -> {
                long count = daoCommander.getDao(0).count(FlowerType.PEONY);
                long count2 = daoCommander.getDao(0).count(FlowerType.ROSE);
                long count3 = daoCommander.getDao(1).count(WrapType.NYLON);

                if (count >= 18 && count2 >= 36 && count3 >= 1) {
                    return true;
                } else {
                    view.print(FlowerType.PEONY + " " + count + "; " + FlowerType.ROSE + " " + count2 + "; " + WrapType.NYLON + " " + count3);
                }
            }
            default -> {
                return false;
            }
        }

        return false;
    }
}
