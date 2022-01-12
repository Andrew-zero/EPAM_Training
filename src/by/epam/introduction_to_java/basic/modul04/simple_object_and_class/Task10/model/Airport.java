package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.model;


import java.util.ArrayList;
import java.util.List;

public class Airport {
    private ArrayList<AirLine> airLines = new ArrayList<>();

    public Airport() {
    }

    public Airport(ArrayList<AirLine> airPlanes) {
        this.airLines = airPlanes;
    }

    public List<AirLine> getAllAirLines() {
        return airLines;
    }

    public void setAirLines(ArrayList<AirLine> airLines) {
        this.airLines = airLines;
    }

    public void addAirPlane(AirLine airPlane) {
        airLines.add(airPlane);
    }

    public void remove(AirLine airPlane) {
        airLines.remove(airPlane);
    }
}
