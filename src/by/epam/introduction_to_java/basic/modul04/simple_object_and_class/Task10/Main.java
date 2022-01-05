package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10;


import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Enum.Option;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Logic.LogicAirPlane;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Model.AirLine;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Model.AirPlane;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.View.ViewAirLine;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AirLine airLine = new AirLine();
        LogicAirPlane logicAirPlane = new LogicAirPlane(airLine);
        ViewAirLine viewAirLine = new ViewAirLine(logicAirPlane);
        List<AirPlane> airPlanes;

        logicAirPlane.initialization();

        viewAirLine.choseOption();
        Option option = viewAirLine.returnOption(viewAirLine.inputNumber());
        airPlanes = viewAirLine.resultAction(option);

        viewAirLine.viewFlightFromAirLines(airPlanes);
    }
}
