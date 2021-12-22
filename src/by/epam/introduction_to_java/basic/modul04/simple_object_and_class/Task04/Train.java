package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04;


import javax.xml.crypto.Data;

/*
Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */
public class Train {
    private String destination;
    private int trainNumber;
    private Data departTime;

    Train[] depo = new Train[5];


    public void viewInfo(int trainNumber) {
        for (Train t : depo) {
            if (t.trainNumber == trainNumber) {
                System.out.printf("Destination - %s, train number - %d, departure time - %t", t.destination, t.trainNumber, t.departTime);
            }
        }
    }

    public void sortByDestination() {
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

    public void sortByNumber() {
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
