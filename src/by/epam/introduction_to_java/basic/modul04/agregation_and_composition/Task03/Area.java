package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task03;

import java.util.Arrays;
import java.util.Objects;

public class Area {
    private String name;
    private String regionalCenter;
    private double square;
    private City[] cities;

    public Area() {
    }

    public Area(String name, String regionalCenter, double square, City[] cities) {
        this.name = name;
        this.regionalCenter = regionalCenter;
        this.square = square;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(String regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public void addCity(City city) {
        int capacity = cities.length + 1;
        City[] newCities = new City[capacity];

        System.arraycopy(cities, 0, newCities, 0, newCities.length - 1);

        newCities[newCities.length - 1] = city;
        cities = newCities;
    }

    public void removeCity(City city) {
        int capacity = cities.length - 1;
        City[] newCities = new City[capacity];

        for (int i = 0, j = 0; i < cities.length; i++) {
            if (!cities[i].equals(city)) {
                newCities[j] = cities[i];
                j++;
            }
        }

        cities = newCities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return Double.compare(area.square, square) == 0 && Objects.equals(name, area.name) && Objects.equals(regionalCenter, area.regionalCenter) && Arrays.equals(cities, area.cities);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, regionalCenter, square);
        result = 31 * result + Arrays.hashCode(cities);
        return result;
    }

    @Override
    public String toString() {
        return "Area{" +
                "name='" + name + '\'' +
                ", regionalCenter='" + regionalCenter + '\'' +
                ", square=" + square +
                ", cities=" + Arrays.toString(cities) +
                '}';
    }
}
