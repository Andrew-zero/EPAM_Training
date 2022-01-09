package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task03;

public class Main {
    private static final int COUNT_OBJECT = 20;

    public static void main(String[] args) {
        District[] districts = new District[COUNT_OBJECT];
        City[] cities = new City[COUNT_OBJECT];
        Area[] areas = new Area[COUNT_OBJECT];
        Country country = new Country();

        for (int i = 0; i < COUNT_OBJECT; i++) {
            districts[i] = new District();
            districts[i].setName(District.class.getSimpleName() + " " + i);
            districts[i].setSquare(i + 10);
        }

        for (int i = 0; i < COUNT_OBJECT; i++) {
            cities[i] = new City();
            cities[i].setName(City.class.getSimpleName() + " " + i);
            cities[i].setDistricts(districts);
            cities[i].setSquare(CountryLogic.totalDistrictsSquare(cities[i].getDistricts()));
        }

        for (int i = 0; i < COUNT_OBJECT; i++) {
            areas[i] = new Area();
            areas[i].setName(Area.class.getSimpleName() + " " + i);
            areas[i].setCities(cities);
            areas[i].setSquare(CountryLogic.totalCitiesSquare(areas[i].getCities()));
            areas[i].setRegionalCenter(Area.class.getSimpleName() + " Региональный центр " + (i * 2));
        }

        country.setName("Super" + Country.class.getSimpleName());
        country.setAreas(areas);
        country.setSquare(CountryLogic.totalAreasSquare(country.getAreas()));
        country.setCapital("Mega Capital");

        ViewHelper.viewCapital(country);
        ViewHelper.totalAreas(country);
        ViewHelper.totalSquare(country);
        ViewHelper.viewRegionalCenter(country);
    }
}
