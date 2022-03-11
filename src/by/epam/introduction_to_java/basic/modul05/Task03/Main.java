package by.epam.introduction_to_java.basic.modul05.Task03;


import java.time.LocalDate;
import java.time.Month;

/*
Задача 3.
Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
выходных и праздничных днях.
 */
public class Main {


    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        LogicDayOff logicDayOff = new LogicDayOff(calendar);
        View view = new View(calendar);

        LocalDate christmas = LocalDate.of(2022, Month.DECEMBER, 25);
        LocalDate christmas2 = LocalDate.of(2022, Month.JANUARY, 7);

        Calendar.DayOff christmasDay = new Calendar.DayOff("Christmas", christmas);
        Calendar.DayOff christmasDay2 = new Calendar.DayOff("Christmas_2", christmas2);

        logicDayOff.addDayOff(christmasDay);
        logicDayOff.addDayOff(christmasDay2);

        view.printAllDayOff();
        view.printDate();
    }
}
