package by.epam.introduction_to_java.basic.modul05.Task03;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

//Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
//        выходных и праздничных днях.
public class Calendar extends GregorianCalendar implements Serializable {

    private static long serialVersionUID = 129348938L;
    private List<DayOff> dayOffList = new ArrayList<>();


    public Calendar() {
    }


    public static class DayOff {
        private LocalDate date;

        public DayOff(){}

        public DayOff(int year, int month, int day) {
        }

        public LocalDate createDate(int year, int month, int day) {
            return LocalDate.of(year, month, day);
        }

        public LocalDate createDate(int year, Month month, int day) {
            return LocalDate.of(year, month, day);
        }




    }
}
