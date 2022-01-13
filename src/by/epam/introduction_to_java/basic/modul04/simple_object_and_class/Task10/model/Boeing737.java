package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task10.model;

import java.util.Objects;

public class Boeing737 extends Plane{
    private String number;

    public Boeing737(){}

    public Boeing737(String number){
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boeing737 boeing737 = (Boeing737) o;
        return Objects.equals(number, boeing737.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Boeing737{" +
                "number='" + number + '\'' +
                '}';
    }
}
