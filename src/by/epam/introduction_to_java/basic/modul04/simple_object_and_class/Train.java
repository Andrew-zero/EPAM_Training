package by.epam.introduction_to_java.basic.modul04.simple_object_and_class;


import java.util.Date;
import java.util.Objects;

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
    private Date departureTime;
    Train[] trainPark = new Train[5];

    public Train(){

    }


    public void viewNumberTrain(int number){
        System.out.println("Номер поезда " + trainNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return trainNumber == train.trainNumber && destination.equals(train.destination) && departureTime.equals(train.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, trainNumber, departureTime);
    }
}
