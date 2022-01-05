package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10;


import java.util.ArrayList;
import java.util.List;

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




    public List<AirPlane> findAllFlightDestination(Destination destination){
        List<AirPlane> airPlanes = new ArrayList<>();

        for(AirPlane airPlane : getAllAirPlanes()){
            if(airPlane.getDestination().equals(destination)){
                    airPlanes.add(airPlane);
            }
        }

        return airPlanes;
    }

    public List<AirPlane> getAllAirPlanes(){
        return airLine.getAllAirPlanes();
    }

    public AirLine getAirLine() {
        return airLine;
    }

    public void setAirLine(AirLine airLine) {
        this.airLine = airLine;
    }
}
