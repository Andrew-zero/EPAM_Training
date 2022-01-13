package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.TourLogic;


import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.Destination;
import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.Option;
import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.entity.Tour;
import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.view.ViewHelper;

/*
Реализовать сортировку путевок
 */
public class TourLogic {
    private ViewHelper viewHelper;

    public TourLogic() {
    }

    public TourLogic(ViewHelper viewHelper) {
        this.viewHelper = viewHelper;
    }

    public Tour initialization(ViewHelper viewHelper) {
        Tour tour;
        String messageVehicle = "Вам неоходим транспорт \n Y/N? \n ->";
        String messageNutrition = "Питание включено: \n Y/N? \n ->";
        String messageCountDay = "Введите желаемое количество дней: \n -> ";
        String messageOption = "Выберите № путёвки: \n ->";
        String messageDestination = "Выберите место назначения: \n ->";
        boolean vehicle;
        boolean nutrition;
        int countDay;
        int price;
        Option option;
        Destination destination;

        viewHelper.print(messageVehicle);
        vehicle = viewHelper.choiceBoolean(viewHelper.inputChoice());

        viewHelper.print(messageNutrition);
        nutrition = viewHelper.choiceBoolean(viewHelper.inputChoice());

        viewHelper.print(messageCountDay);
        countDay = viewHelper.inputInt();

        viewHelper.print(messageOption);
        option = viewHelper.choiceOption(viewHelper.inputInt());

        viewHelper.print(messageDestination);
        destination = viewHelper.choiceDestination(viewHelper.inputInt());

        price = option.getPrice() + destination.getPrice();

        tour = new Tour(vehicle, nutrition, countDay, option, price, destination);

        return tour;
    }




}
/*
Выполнить сортировку путевок
 */