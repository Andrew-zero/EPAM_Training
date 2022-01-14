package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.entity;


import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.Destination;
import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.Option;

import java.util.Objects;

/*
5.	Туристические путевки. Сформировать набор предложений клиенту по выбору
туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.

Учитывать возможность выбора транспорта, питания и числа дней.
Реализовать выбор и сортоирвку путевок.
 */
public class Tour {
    private boolean vehicle;
    private boolean nutrition;
    private int countDay;
    private int price;

    private Option option;
    private Destination destination;

    public Tour() {
    }

    public Tour(boolean vehicle, boolean nutrition, int countDay, Option option, int price, Destination destination) {
        this.vehicle = vehicle;
        this.nutrition = nutrition;
        this.countDay = countDay;
        this.option = option;
        this.price = price;
        this.destination = destination;
    }

    public boolean isVehicle() {
        return vehicle;
    }

    public void setVehicle(boolean vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isNutrition() {
        return nutrition;
    }

    public void setNutrition(boolean nutrition) {
        this.nutrition = nutrition;
    }

    public int getCountDay() {
        return countDay;
    }

    public void setCountDay(int countDay) {
        this.countDay = countDay;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return vehicle == tour.vehicle && nutrition == tour.nutrition && countDay == tour.countDay && price == tour.price && Objects.equals(option, tour.option) && Objects.equals(destination, tour.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicle, nutrition, countDay, price, option, destination);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "vehicle=" + vehicle +
                ", nutrition=" + nutrition +
                ", countDay=" + countDay +
                ", price=" + price +
                ", option=" + option +
                ", destination=" + destination +
                '}';
    }
}
