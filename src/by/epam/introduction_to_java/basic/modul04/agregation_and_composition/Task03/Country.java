package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task03;


import java.util.ArrayList;

/*
3.	Создать объект класса Государство, используя классы Область, Город, Район.

Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
public class Country {
    private String name;
    private String capital;
    private Area[] areas;
    private double square;

    public Country(){}

    public Country(String name, String capital, Area[] areas, double square) {
        this.name = name;
        this.capital = capital;
        this.areas = areas;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Area[] getAreas() {
        return areas;
    }

    public void setAreas(Area[] areas) {
        this.areas = areas;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
