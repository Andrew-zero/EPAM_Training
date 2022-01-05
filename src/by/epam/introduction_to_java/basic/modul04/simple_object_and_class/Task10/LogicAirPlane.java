package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10;


import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task06.Watch;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Model.Boeing737;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Model.Plane;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Найти и вывести:
a)	список рейсов для заданного пункта назначения;
b)	список рейсов для заданного дня недели;
c)	список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class LogicAirPlane {
    private AirLine airLine;

    public LogicAirPlane() {
    }

    public LogicAirPlane(AirLine airLine) {
        this.airLine = airLine;
    }

    public List<AirPlane> initialization() {
        int numberPlane = 20;
        List<AirPlane> airPlanes = getAllAirPlanes();

        for (int i = 0; i < numberPlane; i++) {
            Destination destination;
            int flightNumber;
            Plane plane;
            Watch departureTime;
            DayOfWeek dayOfWeek;

            if (i % 3 == 0) {
                destination = Destination.values()[i % (Destination.values().length - 1)];
                flightNumber = i;
                plane = new Boeing737();
                departureTime = new Watch(i, i, i);
                dayOfWeek = DayOfWeek.values()[i % (DayOfWeek.values().length - 1)];
            } else if (i % 4 == 0) {
                destination = Destination.values()[i % (Destination.values().length - 1)];
                flightNumber = i;
                plane = new Boeing737();
                departureTime = new Watch(i, i, i);
                dayOfWeek = DayOfWeek.values()[i % (DayOfWeek.values().length - 1)];
            } else if (i % 5 == 0) {
                destination = Destination.values()[i % (Destination.values().length - 1)];
                flightNumber = i;
                plane = new Boeing737();
                departureTime = new Watch(i, i, i);
                dayOfWeek = DayOfWeek.values()[i % (DayOfWeek.values().length - 1)];
            } else {
                destination = Destination.values()[i % (Destination.values().length - 1)];
                flightNumber = i;
                plane = new Boeing737();
                departureTime = new Watch(i, i, i);
                dayOfWeek = DayOfWeek.values()[i % (DayOfWeek.values().length - 1)];
            }

            airPlanes.add(new AirPlane(destination, flightNumber, plane, departureTime, dayOfWeek));
        }

        return airPlanes;
    }

    public List<AirPlane> findFlightDayAfterTime(DayOfWeek dayOfWeek, Watch watch) {
        List<AirPlane> airPlanes;

        airPlanes = getAllAirPlanes().stream()
                .filter(airPlane -> airPlane.getDayOfWeek().equals(dayOfWeek))
                .filter(airPlane -> airPlane.getDepartureTime().getHour() > watch.getHour()
                        || (airPlane.getDepartureTime().getHour() == watch.getHour()
                        && airPlane.getDepartureTime().getMin() > watch.getMin())
                        || (airPlane.getDepartureTime().getHour() == watch.getHour()
                        && airPlane.getDepartureTime().getMin() == watch.getMin())
                        && airPlane.getDepartureTime().getSec() > watch.getSec())
                .collect(Collectors.toList());

        return airPlanes;
    }

    public List<AirPlane> findFlightFromDay(DayOfWeek dayOfWeek) {
        List<AirPlane> airPlanes = new ArrayList<>();

        for (AirPlane airPlane : getAllAirPlanes()) {
            if (airPlane.getDayOfWeek().equals(dayOfWeek)) {
                airPlanes.add(airPlane);
            }
        }

        return airPlanes;
    }

    public List<AirPlane> findAllFlightDestination(Destination destination) {
        List<AirPlane> airPlanes = new ArrayList<>();

        for (AirPlane airPlane : getAllAirPlanes()) {
            if (airPlane.getDestination().equals(destination)) {
                airPlanes.add(airPlane);
            }
        }

        return airPlanes;
    }

    public List<AirPlane> getAllAirPlanes() {
        return airLine.getAllAirPlanes();
    }

    public AirLine getAirLine() {
        return airLine;
    }

    public void setAirLine(AirLine airLine) {
        this.airLine = airLine;
    }
}
