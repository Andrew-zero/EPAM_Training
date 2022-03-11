package by.epam.introduction_to_java.basic.modul05.Task03;

public class View {
    Calendar calendar;

    public View() {
    }

    public View(Calendar calendar) {
        this.calendar = calendar;
    }

    public void printAllDayOff() {
        for (Calendar.DayOff dayOff : calendar.getDayOffList()) {
            System.out.println(dayOff);
        }
    }

    public void printDayOff(Calendar.DayOff dayOff) {
        System.out.println(dayOff);
    }

    public void printDate() {
        System.out.println(calendar.getTime());
    }
}
