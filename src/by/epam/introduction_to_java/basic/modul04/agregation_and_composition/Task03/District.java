package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task03;

import java.util.Objects;

public class District {
    private String name;
    private double square;

    public District(){}

    public District(double square){
        this.square = square;
    }

    public District(String name, double square) {
        this.name = name;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Double.compare(district.square, square) == 0 && Objects.equals(name, district.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, square);
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", square=" + square +
                '}';
    }
}
