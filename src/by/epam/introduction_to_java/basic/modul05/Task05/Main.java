package by.epam.introduction_to_java.basic.modul05.Task05;

import by.epam.introduction_to_java.basic.modul05.Task05.controller.BouquetController;
import by.epam.introduction_to_java.basic.modul05.Task05.controller.Shop;
import by.epam.introduction_to_java.basic.modul05.Task05.controller.command.CompoundCommand;
import by.epam.introduction_to_java.basic.modul05.Task05.dao.DaoCommander;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.BouquetType;
import by.epam.introduction_to_java.basic.modul05.Task05.view.View;

import java.util.Random;


/*
Задача 5.
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы
и упаковка.
 */

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        View view = new View();
        DaoCommander daoCommander = new DaoCommander();
        CompoundCommand compoundCommand = new CompoundCommand();
        BouquetController bouquetController = new BouquetController(view, daoCommander, compoundCommand);

        compoundCommand.setShop(shop);
        compoundCommand.init();
        shop.setBouquetController(bouquetController);

/*
    Мы знаем что для каждого букета необходимо определённое количество цветов:

    BouquetType.ONE = FlowerType.ROSE (30 piece) + WrapType.PAPER (1 piece);
    BouquetType.TWO = FlowerType.TULIP (100 piece) + WrapType.CELLOPHANE (1 piece);
    BouquetType.THREE = FlowerType.PEONY (18 piece) + FlowerType.ROSE (36 piece) +  + WrapType.NYLON (1 piece);
*/

        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            int number = random.nextInt(BouquetType.values().length);
            Bouquet bouquet = bouquetController.createBouquet(BouquetType.values()[number]);
            view.viewBouquet(bouquet);
        }
    }
}
