package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Model;


import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Model.AirPlane;

import java.util.ArrayList;
import java.util.List;

public class AirLine {
    private ArrayList<AirPlane> airPlanes = new ArrayList<>();

    public AirLine() {
    }

    public AirLine(ArrayList<AirPlane> airPlanes) {
        this.airPlanes = airPlanes;
    }

    public List<AirPlane> getAllAirPlanes() {
        return airPlanes;
    }

    public void setAirPlanes(ArrayList<AirPlane> airPlanes) {
        this.airPlanes = airPlanes;
    }

    public void addAirPlane(AirPlane airPlane) {
        airPlanes.add(airPlane);
    }

    public void remove(AirPlane airPlane) {
        airPlanes.remove(airPlane);
    }
}
