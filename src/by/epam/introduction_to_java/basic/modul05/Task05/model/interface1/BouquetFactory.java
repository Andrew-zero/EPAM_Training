package by.epam.introduction_to_java.basic.modul05.Task05.model.interface1;

import by.epam.introduction_to_java.basic.modul05.Task05.controller.BouquetController;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.BouquetType;

public interface BouquetFactory {
    Bouquet createBouquet(BouquetType type, BouquetController bouquetController);
}
