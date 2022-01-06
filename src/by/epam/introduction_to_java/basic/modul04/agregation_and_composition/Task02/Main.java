package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task02;

public class Main {

    public static void main(String[] args) {
        ViewCar viewCar = new ViewCar();
        Engine engine = new Engine("1234567890", 250);
        Wheel[] wheels = new Wheel[4];

        viewCar.print("Введите диаметр колеса");
        double diameter = viewCar.inputDouble();

        viewCar.print("Введите брэнд колеса");
        String brand = viewCar.inputString();

        viewCar.print("Введите тип колеса");
        viewCar.print("Доступные типы колеса: ");
        viewCar.printType();
        Type type = viewCar.choseType();

        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(diameter, brand, type);
        }

        Car car = new Car("BWM", engine, wheels);

        viewCar.viewModelCar(car);
    }
}
