package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task03;


public class CountryLogic {


    public static double totalAreasSquare(Area[] areas) {
        double result = 0;

        for (Area a : areas) {
            result += a.getSquare();
        }

        return result;
    }

    public static double totalCitiesSquare(City[] cities) {
        double result = 0;

        for (City c : cities) {
            result += c.getSquare();
        }

        return result;
    }

    public static double totalDistrictsSquare(District[] districts) {
        double result = 0;

        for (District d : districts) {
            result += d.getSquare();
        }

        return result;
    }
}
