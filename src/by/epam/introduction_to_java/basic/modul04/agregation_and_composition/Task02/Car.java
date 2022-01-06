package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task02;


/*
2.	Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Car {

    private static final double GAS_TANK_CAPACITY = 50;

    private boolean move;
    private double volume;
    private String model;
    private Engine engine;
    private Wheel[] wheels;


    public Car() {
    }

    public Car(String model, Engine engine, Wheel[] wheels) {
        this.move = false;
        this.volume = 0;
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void move() {
        move = true;
    }

    public void stop() {
        move = false;
    }

    public void fillUp(double liter) {
        if (volume + liter < GAS_TANK_CAPACITY) {
            this.volume += liter;
        } else {
            volume = GAS_TANK_CAPACITY;
        }
    }

    public void changeWheel(int numberWheel, Wheel wheel) {
        if (numberWheel < 1 || numberWheel > 4) {
            throw new IllegalArgumentException("У этой машины 4 колеса");
        }

        wheels[numberWheel - 1] = wheel;
    }

    public void changeEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isMove() {
        return move;
    }

    public double getVolume() {
        return volume;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }


}
