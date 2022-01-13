package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.main;

import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.TourLogic.TourLogic;
import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.entity.Tour;
import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.view.ViewHelper;

public class Main {

    public static void main(String[] args){
        ViewHelper viewHelper = new ViewHelper();
        TourLogic tourLogic = new TourLogic();

        Tour tour = tourLogic.initialization(viewHelper);

        viewHelper.print("Поздравляем, вы выбрали путёвку!");
        viewHelper.print(tour);



    }
}
