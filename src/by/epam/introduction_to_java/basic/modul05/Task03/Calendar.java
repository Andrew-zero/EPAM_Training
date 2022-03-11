package by.epam.introduction_to_java.basic.modul05.Task03;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;

//Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
//        выходных и праздничных днях.
public class Calendar extends GregorianCalendar implements Serializable {

    private static long serialVersionUID = 129348938L;
    private List<DayOff> dayOffList = new ArrayList<>();


    public Calendar() {
    }

    public List<DayOff> getDayOffList() {
        return dayOffList;
    }

    public void setDayOffList(List<DayOff> dayOffList) {
        this.dayOffList = dayOffList;
    }

    public static class DayOff {
        private String name;
        private LocalDate date;

        public DayOff() {
        }

        public DayOff(String name, LocalDate localDate) {
            this.name = name;
            date = localDate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DayOff dayOff = (DayOff) o;
            return Objects.equals(name, dayOff.name) && Objects.equals(date, dayOff.date);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, date);
        }

        @Override
        public String toString() {
            return "DayOff{" +
                    "name='" + name + '\'' +
                    ", date=" + date +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Calendar calendar = (Calendar) o;
        return Objects.equals(dayOffList, calendar.dayOffList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dayOffList);
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "today is=" + getTime() +
                ", dayOffList=" + dayOffList +
                '}';
    }
}
