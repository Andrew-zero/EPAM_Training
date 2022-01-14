package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.entity;

import java.util.ArrayList;
import java.util.Objects;

public class TourBase {
    private ArrayList<Tour> tourList = new ArrayList<>();

    public TourBase() {
    }

    public TourBase(ArrayList<Tour> tourList) {
        this.tourList = tourList;
    }

    public ArrayList<Tour> getTourList() {
        return tourList;
    }

    public void setTourList(ArrayList<Tour> tourList) {
        this.tourList = tourList;
    }

    public void addTour(Tour tour){
        tourList.add(tour);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourBase tourBase = (TourBase) o;
        return Objects.equals(tourList, tourBase.tourList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tourList);
    }

    @Override
    public String toString() {
        return "TourBase{" +
                "tourList=" + tourList +
                '}';
    }
}
