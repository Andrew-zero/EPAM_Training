package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task03;

import java.util.Arrays;
import java.util.Objects;

public class City {
    private String name;
    private double square;
    private District[] districts;

    public City(){}

    public City(String name) {
        this.name = name;
    }

    public City(String name, double square, District[] districts) {
        this.name = name;
        this.square = square;
        this.districts = districts;
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

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Double.compare(city.square, square) == 0 && Objects.equals(name, city.name) && Arrays.equals(districts, city.districts);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, square);
        result = 31 * result + Arrays.hashCode(districts);
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", square=" + square +
                ", districts=" + Arrays.toString(districts) +
                '}';
    }
}
