package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10;


import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Model.Plane;

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
public class AirLine {
    private String destination;
    private int flightNumber;
    private Plane plane;
    private long departureTime;
    private DayOfWeek dayOfWeek;

    public AirLine(){}

    public AirLine(Plane plane) {
        this.plane = plane;
    }

    public AirLine(String destination, int flightNumber, Plane plane, long departureTime, DayOfWeek dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.plane = plane;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public Plane getPlane() {
        return plane;
    }

    public long getDepartureTime() {
        return departureTime;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDepartureTime(long departureTime) {
        this.departureTime = departureTime;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
