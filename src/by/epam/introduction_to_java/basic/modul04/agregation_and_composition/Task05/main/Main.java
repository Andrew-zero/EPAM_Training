package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.main;

import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.TourLogic.TourLogic;
import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.entity.Tour;
import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.entity.TourBase;
import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.view.ViewHelper;

public class Main {

    public static void main(String[] args) {
        ViewHelper viewHelper = new ViewHelper();
        TourLogic tourLogic = new TourLogic();
        TourBase tourBase = new TourBase();

        for (int i = 0; i < 2; i++) {
            Tour tour = tourLogic.initialization(viewHelper);
            tourBase.addTour(tour);
        }

        viewHelper.print();
        Tour tour = tourLogic.initialization(viewHelper);
        tourBase.addTour(tour);
        viewHelper.print("Вы выбрали путёвку: ");
        viewHelper.print(tour);
        viewHelper.print();

        viewHelper.print("Сортировка по месту назначения: ");
        tourLogic.sortByDestination(tourLogic.getAllTour(tourBase));
        viewHelper.print(tourBase.getTourList());
        viewHelper.print();

        viewHelper.print("Сортировка по причине выезда: ");
        tourLogic.sortByCause(tourLogic.getAllTour(tourBase));
        viewHelper.print();
        viewHelper.print(tourBase.getTourList());
        viewHelper.print();

        viewHelper.print("Сортировка по количеству дней: ");
        tourLogic.sortByCountDay(tourLogic.getAllTour(tourBase));
        viewHelper.print();
        viewHelper.print(tourBase.getTourList());
        viewHelper.print();

        viewHelper.print("Сортировка по цене: ");
        tourLogic.sortByPrice(tourLogic.getAllTour(tourBase));
        viewHelper.print();
        viewHelper.print(tourBase.getTourList());
        viewHelper.print();

        viewHelper.print("Сортировка по учитыванию транспорта: ");
        tourLogic.sortByVehicle(tourLogic.getAllTour(tourBase));
        viewHelper.print();
        viewHelper.print(tourBase.getTourList());

        viewHelper.print("Сортировка по учитыванию питания: ");
        tourLogic.sortByNutrition(tourLogic.getAllTour(tourBase));
        viewHelper.print();
        viewHelper.print(tourBase.getTourList());
    }
}
