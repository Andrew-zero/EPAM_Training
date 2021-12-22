package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04;


/*
Добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */
public class TrainLogic {

    public TrainLogic(){}

    public FictionDB initializeTrainDepo(){
        FictionDB fictionDB = new FictionDB();

        Train[] trainDepo = fictionDB.getDepo();

        for(int i = 0; i < trainDepo.length; i++){
            trainDepo[i] = new Train();
        }

    }

    public void sortByDestination(Train[] depo) {
        int d = depo.length / 2;

        while(d > 0){
            for(int i = 0; i < depo.length - d; i++){
                int j = i;
//                while((j >= 0) && (depo[j].destination > depo[j+d].destination)){
//
//                }
            }
        }
    }

    public void sortByNumber(Train[] depo) {
        int d = depo.length / 2;

        while (d > 0) {
            for (int i = 0; i < depo.length - d; i++) {
                int j = i;
                while ((j >= 0) && (depo[j].trainNumber > depo[j + d].trainNumber)) {
                    int temp = depo[j].trainNumber;
                    depo[j].trainNumber = depo[j + d].trainNumber;
                    depo[j + d].trainNumber = temp;
                    j--;
                }
            }
            d /= 2;
        }
    }


}
