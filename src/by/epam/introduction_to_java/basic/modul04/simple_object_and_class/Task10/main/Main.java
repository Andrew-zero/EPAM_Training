package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.main;


import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.logic.LogicAirLine;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.model.Airport;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.model.AirLine;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Option;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.view.ViewAirLine;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Airport airLine = new Airport();
        LogicAirLine logicAirPlane = new LogicAirLine(airLine);
        ViewAirLine viewAirLine = new ViewAirLine(logicAirPlane);
        List<AirLine> airPlanes;

        logicAirPlane.initialization();

        viewAirLine.choseOption();
        Option option = viewAirLine.returnOption(viewAirLine.inputNumber());
        airPlanes = viewAirLine.resultAction(option);

        viewAirLine.viewFlightFromAirLines(airPlanes);
    }
}
