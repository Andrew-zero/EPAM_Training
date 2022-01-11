package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04.logic;


import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04.Entity.Depo;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04.Entity.Train;

import java.util.Date;

/*
Добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */
public class TrainLogic {

    private Depo data = new Depo();

    public TrainLogic() {
    }

    public void initializeTrainDepo() {
        Train[] trainDepo = data.getDepo();

        for (int i = 0, k = 'A'; i < trainDepo.length; i++, k++) {
            trainDepo[i] = new Train(i);
            trainDepo[i].setDestination(String.valueOf((char) k));
            trainDepo[i].setDepartTime(new Date());
        }
    }

    public Train[] getAllTrains() {
        return data.getDepo();
    }

    public Train getTrainByNumber(int number) {
        for (Train t : getAllTrains()) {
            if (t.getTrainNumber() == number) {
                return t;
            }
        }

        return null;
    }

    public Train[] sortByDestination(Train[] trains) {
        int d = trains.length / 2;

        while (d > 0) {
            for (int i = 0; i < trains.length - d; i++) {
                int j = i;
                while ((j >= 0) && (trains[j].getDestination().compareToIgnoreCase(trains[j + d].getDestination())) < 0) {
                    if (trains[j].getDestination().equalsIgnoreCase(trains[j + d].getDestination())) {
                        if (trains[j].getDepartTime().getTime() > trains[j + d].getDepartTime().getTime()) {
                            Train temp = trains[j + d];
                            trains[j + d] = trains[j];
                            trains[j] = temp;
                        }
                    } else {
                        Train temp = trains[j + d];
                        trains[j + d] = trains[j];
                        trains[j] = temp;
                    }
                }
            }
            d /= 2;
        }

        return trains;
    }

    public Train[] sortByNumber(Train[] trains) {
        int d = trains.length / 2;

        while (d > 0) {
            for (int i = 0; i < trains.length - d; i++) {
                int j = i;
                while ((j >= 0) && (trains[j].getTrainNumber() > trains[j + d].getTrainNumber())) {
                    int temp = trains[j].getTrainNumber();
                    trains[j].setTrainNumber(trains[j + d].getTrainNumber());
                    trains[j + d].setTrainNumber(temp);
                    j--;
                }
            }
            d /= 2;
        }

        return trains;
    }

    public Train[] sortByDepartureTime(Train[] trains) {
        int d = trains.length / 2;

        while (d > 0) {
            for (int i = 0; i < trains.length - d; i++) {
                int j = i;
                while ((j >= 0) && (trains[j].getDepartTime().getTime() > trains[j + d].getDepartTime().getTime())) {
                    long temp = trains[j].getDepartTime().getTime();
                    trains[j].setDepartTime(new Date(trains[j + d].getDepartTime().getTime()));
                    trains[j + d].setDepartTime(new Date(temp));
                }
            }
            d /= 2;
        }

        return trains;
    }

}
