package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.View;

import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task06.Watch;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Enum.DayOfWeek;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Enum.Destination;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Enum.Option;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Logic.LogicAirPlane;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.Model.AirPlane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


/*
Найти и вывести:
a)	список рейсов для заданного пункта назначения;
b)	список рейсов для заданного дня недели;
c)	список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class ViewAirLine {
    private LogicAirPlane logicAirPlane;

    public ViewAirLine() {
    }

    public ViewAirLine(LogicAirPlane logicAirPlane) {
        this.logicAirPlane = logicAirPlane;
    }

    public List<AirPlane> resultAction(Option option) {
        List<AirPlane> airPlane;

        switch (option) {
            case ONE -> {
                print("Доступны следующие пункты назначения: ");
                viewDestination();
                print("Выберите пункт назначения:->");
                airPlane = logicAirPlane.findAllFlightDestination(inputDestination());
            }
            case TWO -> {
                print("Доступны следующие дни недели: ");
                viewDayOfWeek();
                print("Выберите день недели:->");
                airPlane = logicAirPlane.findFlightFromDay(inputDayOfWeek());
            }
            case THREE -> {
                print("Доступны следующие дни недели: ");
                viewDayOfWeek();
                print("Выберите день недели:->");
                DayOfWeek dayOfWeek = inputDayOfWeek();
                print("Введите время предшествующее времени вылета рейсов:->");
                Watch watch = new Watch();
                print("Введите часы:->");
                watch.setHour(inputNumber());
                print("Введите минуты:->");
                watch.setMin(inputNumber());
                print("Введите секунды:->");
                watch.setSec(inputNumber());
                airPlane = logicAirPlane.findFlightDayAfterTime(dayOfWeek, watch);
            }
            default -> throw new IllegalStateException("Unexpected value: " + option);
        }

        return airPlane;
    }

    public Option returnOption(int number) {
        if (!(number >= 0 && number < Option.values().length)) {
            throw new IllegalArgumentException("Выбрана не верная опция");
        }

        return Option.values()[number];
    }

    public DayOfWeek inputDayOfWeek() {
        DayOfWeek dayOfWeek = null;
        String s = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (DayOfWeek d : DayOfWeek.values()) {
            if (s.equals(d.toString())) {
                dayOfWeek = d;
            }
        }

        return dayOfWeek;
    }

    public Destination inputDestination() {
        Destination destination = null;
        String s = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Destination d : Destination.values()) {
            if (s.equals(d.toString())) {
                destination = d;
            }
        }

        return destination;
    }

    public int inputNumber() {
        int number = -1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            number = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return number;
    }

    public void choseOption() {
        String message = "Выбирите одну из следующих опций: ";
        print(message);

        for (Option o : Option.values()) {
            print(o.ordinal() + " - " + o.getDescribe());
        }
    }

    public void viewFlightFromAirLines(List<AirPlane> airPlaneList) {
        for (AirPlane airPlane : airPlaneList) {
            String message = "Flight № " + airPlane.getFlightNumber();
            print(message);
        }
    }

    public void viewAirPlanes(List<AirPlane> airPlaneList) {
        for (AirPlane airPlane : airPlaneList) {
            print(airPlane.toString());
        }
    }

    public void viewAirPlane(AirPlane airPlane) {
        print(airPlane.toString());
    }

    public void viewDayOfWeek() {
        for (DayOfWeek d : DayOfWeek.values()) {
            System.out.println(d);
        }
    }

    public void viewDestination() {
        for (Destination d : Destination.values()) {
            System.out.println(d);
        }
    }

    public void print(String s) {
        System.out.println(s);
    }
}
