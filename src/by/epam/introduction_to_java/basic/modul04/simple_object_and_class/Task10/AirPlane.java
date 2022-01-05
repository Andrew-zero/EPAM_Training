package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10;


import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task06.Watch;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Model.Plane;

import java.util.Objects;

/*
10.	Создать класс Airline, спецификация которого приведена ниже.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Определить конструкторы, set- и get- методы и метод toString().

Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.

Задать критерии выбора данных и вывести эти данные на консоль.


Найти и вывести:
a)	список рейсов для заданного пункта назначения;
b)	список рейсов для заданного дня недели;
c)	список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class AirPlane {
    private Destination destination;
    private int flightNumber;
    private Plane plane;
    private Watch departureTime;
    private DayOfWeek dayOfWeek;

    public AirPlane() {
    }

    public AirPlane(Plane plane) {
        this.plane = plane;
    }

    public AirPlane(Destination destination, int flightNumber, Plane plane, Watch departureTime, DayOfWeek dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.plane = plane;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    public Destination getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public Plane getPlane() {
        return plane;
    }

    public Watch getDepartureTime() {
        return departureTime;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDepartureTime(Watch departureTime) {
        this.departureTime = departureTime;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirPlane airPlane = (AirPlane) o;
        return flightNumber == airPlane.flightNumber && departureTime == airPlane.departureTime && destination == airPlane.destination && Objects.equals(plane, airPlane.plane) && dayOfWeek == airPlane.dayOfWeek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, flightNumber, plane, departureTime, dayOfWeek);
    }

    @Override
    public String toString() {
        return "AirLine{" +
                "destination=" + destination +
                ", flightNumber=" + flightNumber +
                ", plane=" + plane +
                ", departureTime=" + departureTime +
                ", dayOfWeek=" + dayOfWeek +
                '}';
    }
}
