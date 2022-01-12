package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.logic;


import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task06.Watch;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.DayOfWeek;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Destination;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.model.Airport;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.model.AirLine;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.model.Boeing737;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.model.Plane;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Найти и вывести:
a)	список рейсов для заданного пункта назначения;
b)	список рейсов для заданного дня недели;
c)	список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class LogicAirLine {
    private Airport airport;

    public LogicAirLine() {
    }

    public LogicAirLine(Airport airLine) {
        this.airport = airLine;
    }


    public List<AirLine> initialization() {
        int numberPlane = 20;
        List<AirLine> airPlanes = getAllAirPlanes();

        for (int i = 0; i < numberPlane; i++) {
            Destination destination;
            int flightNumber;
            Plane plane;
            Watch departureTime;
            DayOfWeek dayOfWeek;

            destination = Destination.values()[i % (Destination.values().length - 1)];
            flightNumber = i;
            plane = new Boeing737();
            departureTime = new Watch(i, i, i);
            dayOfWeek = DayOfWeek.values()[i % (DayOfWeek.values().length - 1)];

            airPlanes.add(new AirLine(destination, flightNumber, plane, departureTime, dayOfWeek));
        }

        return airPlanes;
    }

    public List<AirLine> findFlightDayAfterTime(DayOfWeek dayOfWeek, Watch watch) {
        List<AirLine> airLines;

        airLines = getAllAirPlanes().stream()
                .filter(airPlane -> airPlane.getDayOfWeek().equals(dayOfWeek))
                .filter(airPlane -> airPlane.getDepartureTime().getHour() > watch.getHour()
                        || (airPlane.getDepartureTime().getHour() == watch.getHour()
                        && airPlane.getDepartureTime().getMin() > watch.getMin())
                        || (airPlane.getDepartureTime().getHour() == watch.getHour()
                        && airPlane.getDepartureTime().getMin() == watch.getMin())
                        && airPlane.getDepartureTime().getSec() > watch.getSec())
                .collect(Collectors.toList());

        return airLines;
    }

    public List<AirLine> findFlightFromDay(DayOfWeek dayOfWeek) {
        List<AirLine> airLines = new ArrayList<>();

        for (AirLine airPlane : getAllAirPlanes()) {
            if (airPlane.getDayOfWeek().equals(dayOfWeek)) {
                airLines.add(airPlane);
            }
        }

        return airLines;
    }

    public List<AirLine> findAllFlightDestination(Destination destination) {
        List<AirLine> airLines = new ArrayList<>();

        for (AirLine airPlane : getAllAirPlanes()) {
            if (airPlane.getDestination().equals(destination)) {
                airLines.add(airPlane);
            }
        }

        return airLines;
    }

    public List<AirLine> getAllAirPlanes() {
        return airport.getAllAirLines();
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
}
