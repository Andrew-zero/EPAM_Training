package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04.Entity;


import java.util.Date;
import java.util.Objects;

/*
Создайте класс Train, содержащий поля:
- название пункта назначения,
- номер поезда,
- время отправления.
Создайте данные в массив из пяти элементов типа Train,
добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */
public class Train {

    private String destination;
    private int trainNumber;
    private Date departTime;

    public Train() {
    }

    public Train(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setDepartTime(Date departTime) {
        this.departTime = departTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public Date getDepartTime() {
        return departTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return trainNumber == train.trainNumber && Objects.equals(destination, train.destination) && Objects.equals(departTime, train.departTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, trainNumber, departTime);
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", departTime=" + departTime +
                '}';
    }
}
