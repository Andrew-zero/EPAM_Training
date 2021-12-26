package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04;

public class Main {


    public static void main(String[] args) {
        TrainLogic trainLogic = new TrainLogic();
        ViewTrain viewTrain = new ViewTrain();
        Train[] trains = trainLogic.getAllTrains();

        trainLogic.initializeTrainDepo();
        viewTrain.viewAllInfo(trains);

        int trainNumber = viewTrain.inputTrainNumber();

        trainLogic.getTrainByNumber(trainNumber);

        trainLogic.sortByDepartureTime(trains);
        viewTrain.viewAllInfo(trains);

        trainLogic.sortByDestination(trains);
        viewTrain.viewAllInfo(trains);

        trainLogic.sortByNumber(trains);
        viewTrain.viewAllInfo(trains);
    }
}
