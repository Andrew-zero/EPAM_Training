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
public class TrainingDate {
    private int sec;
    private int min;
    private int hour;

    public TrainingDate() {
        sec = 0;
        min = 0;
        hour = 0;
    }

    public TrainingDate(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
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
        TrainingDate that = (TrainingDate) o;
        return sec == that.sec && min == that.min && hour == that.hour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sec, min, hour);
    }
}
