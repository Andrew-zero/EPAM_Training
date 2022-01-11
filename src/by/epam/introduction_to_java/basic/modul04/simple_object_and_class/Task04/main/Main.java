package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04.main;

import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04.Entity.Train;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04.logic.TrainLogic;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04.view.ViewTrain;

public class Main {


    public static void main(String[] args) {
        TrainLogic trainLogic = new TrainLogic();
        ViewTrain viewTrain = new ViewTrain();
        Train[] trains = trainLogic.getAllTrains();

        trainLogic.initializeTrainDepo();
        viewTrain.viewAllInfo(trains);

        int trainNumber = viewTrain.inputTrainNumber();

        viewTrain.viewTrain(trainLogic.getTrainByNumber(trainNumber));
        viewTrain.viewAllInfo(trainLogic.sortByDepartureTime(trains));
        viewTrain.viewAllInfo(trainLogic.sortByDestination(trains));
        viewTrain.viewAllInfo(trainLogic.getAllTrains());
        viewTrain.viewAllInfo(trainLogic.sortByNumber(trains));
    }
}
