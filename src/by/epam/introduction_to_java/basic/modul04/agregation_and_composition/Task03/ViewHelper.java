package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task03;

public class ViewHelper {

    public static void viewRegionalCenter(Country country){
        System.out.println("Региональные центры областей: ");
        for(Area a : country.getAreas()){
            regionalCenter(a);
        }
    }

    public static void regionalCenter(Area a){
        System.out.print("У области " + a.getName() + " региональным центром является: ");
        System.out.println(a.getRegionalCenter());
    }

    public static void totalSquare(Country country){
        System.out.println("Общая площадь: " + country.getSquare() + " м2.");
    }

    public static void totalAreas(Country country){
        System.out.println("Общее количество областей: " + country.getAreas().length);

        for(Area a : country.getAreas()){
            System.out.println(a.toString());
        }
    }

    public static void viewCapital(Country country){
        System.out.println(country.getCapital());
    }

    public static void viewCities(City[] cities){
        for (City c : cities){
            System.out.println(c);
        }
    }
}
