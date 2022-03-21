package by.epam.introduction_to_java.basic.modul05.Task04;


import by.epam.introduction_to_java.basic.modul05.Task04.service.FillCave;
import by.epam.introduction_to_java.basic.modul05.Task04.service.Logic;
import by.epam.introduction_to_java.basic.modul05.Task04.view.Menu;
import by.epam.introduction_to_java.basic.modul05.Task04.view.View;

import java.nio.file.Files;
import java.nio.file.Path;

/*
Задача 4.
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.
 */
public class Main {

    public static void main(String[] args) {
        View view = new View();
        Logic logic = new Logic(view);

        Menu menu = new Menu(logic, view);
        view.setMenu(menu);

        FillCave fillCave;

        if (!Files.isReadable(Path.of(logic.getTreasureFileName()))) {
            fillCave = new FillCave(logic);
            fillCave.fill();
        }

        menu.choiceMenu(menu.inputChoiceMenu());
    }
}
