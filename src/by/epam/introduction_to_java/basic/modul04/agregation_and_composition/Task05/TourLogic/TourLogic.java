package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.TourLogic;


import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.Destination;
import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.Option;
import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.entity.Tour;
import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.entity.TourBase;
import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.view.ViewHelper;

import java.util.ArrayList;
import java.util.Comparator;

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
        String messageOption = "Выберите для чего желаете поехать : \n ->";
        String messageDestination = "Выберите место назначения: \n ->";
        boolean vehicle;
        boolean nutrition;
        int countDay;
        int price;
        Option option;
        Destination destination;

        viewHelper.print(messageDestination);
        viewHelper.printDestination();
        destination = viewHelper.choiceDestination(viewHelper.inputInt());

        viewHelper.print(messageOption);
        viewHelper.printOption();
        option = viewHelper.choiceOption(viewHelper.inputInt());

        viewHelper.print(messageCountDay);
        countDay = viewHelper.inputInt();

        viewHelper.print(messageNutrition);
        nutrition = viewHelper.choiceBoolean(viewHelper.inputChoice());

        viewHelper.print(messageVehicle);
        vehicle = viewHelper.choiceBoolean(viewHelper.inputChoice());

        price = option.getPrice() + destination.getPrice();

        tour = new Tour(vehicle, nutrition, countDay, option, price, destination);

        return tour;
    }

    public ArrayList<Tour> getAllTour(TourBase tourBase) {
        return tourBase.getTourList();
    }

    public ArrayList<Tour> sortByDestination(ArrayList<Tour> tours) {
        Comparator<Tour> tourComparator = Comparator.comparing(tour -> tour.getDestination().name());
        tours.sort(tourComparator);

        return tours;
    }

    public ArrayList<Tour> sortByCountDay(ArrayList<Tour> tours) {
        Comparator<Tour> tourComparator = Comparator.comparing(Tour::getCountDay);
        tours.sort(tourComparator);

        return tours;
    }

    public ArrayList<Tour> sortByPrice(ArrayList<Tour> tours) {
        Comparator<Tour> tourComparator = Comparator.comparing((Tour::getPrice));
        tours.sort(tourComparator);

        return tours;
    }

    public ArrayList<Tour> sortByCause(ArrayList<Tour> tours) {
        Comparator<Tour> tourComparator = Comparator.comparing(tour -> tour.getOption().name());
        tours.sort(tourComparator);

        return tours;
    }

    public ArrayList<Tour> sortByVehicle(ArrayList<Tour> tours){
        Comparator<Tour> tourComparator = Comparator.comparing(Tour::isVehicle);
        tours.sort(tourComparator);

        return tours;
    }

    public ArrayList<Tour> sortByNutrition(ArrayList<Tour> tours){
        Comparator<Tour> tourComparator = Comparator.comparing(Tour::isNutrition);
        tours.sort(tourComparator);

        return tours;
    }
}
