package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10;

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


    public Option returnOption(int number) {
        if (!(number >= 0 && number < Option.values().length)) {
            throw new IllegalArgumentException("Выбрана не верная опция");
        }

        return Option.values()[number];
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

    public void printAirPlanes(List<AirPlane> airPlaneList) {
        for (AirPlane a : airPlaneList) {
            print(a.toString());
        }
    }

    public void printAirPlane(AirPlane airPlane) {
        print(airPlane.toString());
    }

    public void print(String s) {
        System.out.println(s);
    }
}
