package by.epam.introduction_to_java.basic.modul05.Task03;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class LogicDayOff {
    private Calendar calendar;

    public LogicDayOff() {
    }

    public LogicDayOff(Calendar calendar) {
        this.calendar = calendar;
    }

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

    public String getName(Calendar.DayOff dayOff) {
        return dayOff.getName();
    }

    public void setName(Calendar.DayOff dayOff, String name) {
        dayOff.setName(name);
    }

    public LocalDate getDate(Calendar.DayOff dayOff) {
        return dayOff.getDate();
    }

    public void setDate(Calendar.DayOff dayOff, LocalDate localDate) {
        dayOff.setDate(localDate);
    }
}
