package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task06;


import java.util.Objects;

/*
Составьте описание класса для представления времени.
Предусмотрите возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с
проверкой допустимости вводимых значений.
В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

//Время:
//сутки - 24 часа от 0 до 23
//час - 60 минут от 0 до 59
//минута - 60 секунд от 0 до 59

public class Watch {
    private int sec;
    private int min;
    private int hour;

    public Watch() {
        sec = 0;
        min = 0;
        hour = 0;
    }

    public Watch(int hour, int min, int sec) {
        this.hour = hour;
        this.sec = sec;
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if (sec < 0 || sec > 59) {
            this.sec = 0;
        } else {
            this.sec = sec;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min < 0 || min > 59) {
            this.min = 0;
        } else {
            this.min = min;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Watch that = (Watch) o;
        return sec == that.sec && min == that.min && hour == that.hour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sec, min, hour);
    }

    @Override
    public String toString() {
        return "Watch{" +
                "sec=" + sec +
                ", min=" + min +
                ", hour=" + hour +
                '}';
    }
}
