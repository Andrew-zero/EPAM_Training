package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04;


import java.util.Date;

/*
Добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */
public class TrainLogic {

    private SourceTrainData data = new SourceTrainData();

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

    public void sortByDestination(Train[] depo) {
        int d = depo.length / 2;

        while (d > 0) {
            for (int i = 0; i < depo.length - d; i++) {
                int j = i;
                while ((j >= 0) && (depo[j].getDestination().compareToIgnoreCase(depo[j + d].getDestination())) < 0) {
                    if (depo[j].getDestination().equalsIgnoreCase(depo[j + d].getDestination())) {
                        if (depo[j].getDepartTime().getTime() > depo[j + d].getDepartTime().getTime()) {
                            Train temp = depo[j + d];
                            depo[j + d] = depo[j];
                            depo[j] = temp;
                        }
                    } else {
                        Train temp = depo[j + d];
                        depo[j + d] = depo[j];
                        depo[j] = temp;
                    }
                }
            }
            d /= 2;
        }
    }

    public void sortByNumber(Train[] depo) {
        int d = depo.length / 2;

        while (d > 0) {
            for (int i = 0; i < depo.length - d; i++) {
                int j = i;
                while ((j >= 0) && (depo[j].getTrainNumber() > depo[j + d].getTrainNumber())) {
                    int temp = depo[j].getTrainNumber();
                    depo[j].setTrainNumber(depo[j + d].getTrainNumber());
                    depo[j + d].setTrainNumber(temp);
                    j--;
                }
            }
            d /= 2;
        }
    }

    public void sortByDepartureTime(Train[] depo) {
        int d = depo.length / 2;

        while (d > 0) {
            for (int i = 0; i < depo.length - d; i++) {
                int j = i;
                while ((j >= 0) && (depo[j].getDepartTime().getTime() > depo[j + d].getDepartTime().getTime())) {
                    long temp = depo[j].getDepartTime().getTime();
                    depo[j].setDepartTime(new Date(depo[j + d].getDepartTime().getTime()));
                    depo[j + d].setDepartTime(new Date(temp));
                }
            }
            d /= 2;
        }
    }

}
