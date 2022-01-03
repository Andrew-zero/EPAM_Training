package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Model;

import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.ViewAirLine;

public class PassangerPlane extends Plane {

    public PassangerPlane(){}

    @Override
    public void fly() {
        ViewAirLine.print("Могу летать");
    }
}
