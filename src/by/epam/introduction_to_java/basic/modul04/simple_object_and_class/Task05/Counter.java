package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task05;



/*
Опишите класс, реализующий десятичный счётчик, который может
увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
Предусмотрите инициализацию счётчика значениями по умолчанию и произвольными значениями.
Счётчик имеет методы
увеличения и уменьшения состояния,
и метод позволяющее получить его текущее состояние.
Написать код, демонстрирующий все возможности класса.
 */

import java.util.Objects;

public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public Counter(int count) {
        if (count >= 0 && count <= 9) {
            this.count = count;
        }
    }

    public void increment() {
        if (count < 9) {
            count++;
        }
    }

    public void decrement() {
        if (count > 0) {
            count--;
        }
    }

    public void setCount(int count) {
        if (count >= 0 && count <= 9) {
            this.count = count;
        }
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counter counter = (Counter) o;
        return count == counter.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }
}
