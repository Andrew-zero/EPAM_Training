package by.epam.introduction_to_java.basic.modul05.Task03;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class LogicDayOff {
    private Calendar calendar = new Calendar();
    private Calendar.DayOff dayOff = new Calendar.DayOff();

    public void addDayOff(Calendar.DayOff dayOff) {
        calendar.getDayOffList().add(dayOff);
    }

    public void removeDayOff(Calendar.DayOff dayOff) {
        calendar.getDayOffList().remove(dayOff);
    }

    public List<Calendar.DayOff> getAllDayOff() {
        return calendar.getDayOffList();
    }

    public void deleteAllDayOff() {
        calendar.setDayOffList(new ArrayList<>());
    }

    public LocalDate createDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public LocalDate createDate(int year, Month month, int day) {
        return LocalDate.of(year, month, day);
    }

    public String getName() {
        return dayOff.getName();
    }

    public void setName(String name) {
        dayOff.setName(name);
    }

    public LocalDate getDate() {
        return dayOff.getDate();
    }

    public void setDate(LocalDate localDate) {
        dayOff.setDate(localDate);
    }
}
